/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ksc.KscClientException
 *  com.ksc.auth.SigningAlgorithm
 *  com.ksc.util.StringUtils
 *  com.ksc.util.json.Jackson
 *  org.apache.commons.lang3.StringUtils
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package common.aws;

import com.alibaba.fastjson.JSON;
import common.auth.KscClientException;
import common.auth.SigningAlgorithm;
import common.utils.SdkHttpUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.stream.Collectors;

@Deprecated
public class AWS4EncryptionUtils {
    private static final Logger log = LoggerFactory.getLogger(AWS4EncryptionUtils.class);

    public static void generateSignature(AWS4EncryptionFactory aws4EncryptionFactory, String requestMethod) throws Exception {
        String contentSha256 = AWS4EncryptionUtils.calculateContentHash(requestMethod, aws4EncryptionFactory);
        String canonicalRequest = AWS4EncryptionUtils.createCanonicalRequest(requestMethod.toUpperCase(), contentSha256, aws4EncryptionFactory);
        log.info("canonicalRequest:{}", (Object)canonicalRequest);
        String stringToSign = AWS4EncryptionUtils.createStringToSign(canonicalRequest, aws4EncryptionFactory);
        byte[] signingKey = AWS4EncryptionUtils.newSigningKey(aws4EncryptionFactory.getSecretKey(), aws4EncryptionFactory.getTimeStamp(), aws4EncryptionFactory.getRegion(), aws4EncryptionFactory.getService());
        byte[] signature = AWS4EncryptionUtils.computeSignature(stringToSign, signingKey);
        String signatureStr = BinaryUtils.toHex(signature);
        StringBuilder authorizationBuild = new StringBuilder(aws4EncryptionFactory.getAlgorithm()).append(" ").append("Credential=").append(aws4EncryptionFactory.getAccessKey()).append("/").append(aws4EncryptionFactory.getCredentialScope()).append(", ").append("SignedHeaders=").append(aws4EncryptionFactory.getHeadKey()).append(",").append("Signature=").append(signatureStr);
        String authorization = authorizationBuild.toString();
        aws4EncryptionFactory.getHead().put("Authorization", authorization);
        aws4EncryptionFactory.getHead().put("x-amz-date", aws4EncryptionFactory.getFormattedTimestamp());
    }

    private static byte[] computeSignature(String stringToSign, byte[] signingKey) {
        return AWS4EncryptionUtils.sign(stringToSign.getBytes(Charset.forName("UTF-8")), signingKey, SigningAlgorithm.HmacSHA256);
    }

    protected static String createStringToSign(String canonicalRequest, AWS4EncryptionFactory aws4EncryptionFactory) {
        StringBuilder credentialScopeBuilder = new StringBuilder(aws4EncryptionFactory.getTimeStamp());
        String credentialScope = credentialScopeBuilder.append("/").append(aws4EncryptionFactory.getRegion()).append("/").append(aws4EncryptionFactory.getService()).append("/aws4_request").toString();
        aws4EncryptionFactory.setCredentialScope(credentialScope);
        StringBuilder stringToSignBuilder = new StringBuilder(aws4EncryptionFactory.getAlgorithm());
        stringToSignBuilder.append("\n").append(aws4EncryptionFactory.getFormattedTimestamp()).append("\n").append(credentialScope).append("\n").append(BinaryUtils.toHex(BinaryUtils.hash(canonicalRequest)));
        String stringToSign = stringToSignBuilder.toString();
        return stringToSign;
    }

    private static String calculateContentHash(String requestMethod, AWS4EncryptionFactory aws4EncryptionFactory) {
        Map<String, Object> requestParamMap = aws4EncryptionFactory.getRequestParam();
        ByteArrayInputStream payloadStream = new ByteArrayInputStream(new byte[0]);
        if (requestMethod.toUpperCase().equals("POST")) {
            String contentType = aws4EncryptionFactory.getHead().get("Content-Type");
            if (contentType.equals("application/json")) {
                payloadStream = new ByteArrayInputStream(JSON.toJSONString(requestParamMap).getBytes(StandardCharsets.UTF_8));
            } else {
                String requestParamUri = AWS4EncryptionFactory.getRequestParamUri(requestParamMap);
                payloadStream = new ByteArrayInputStream(requestParamUri.getBytes(StandardCharsets.UTF_8));
            }
        }
        ((InputStream)payloadStream).mark(-1);
        String contentSha256 = BinaryUtils.toHex(BinaryUtils.hash(payloadStream));
        try {
            ((InputStream)payloadStream).reset();
            return contentSha256;
        }
        catch (IOException var6) {
            throw new KscClientException("Unable to reset stream after calculating AWS4 signature", (Throwable)var6);
        }
    }

    private static String createCanonicalRequest(String requestMethod, String contentSha256, AWS4EncryptionFactory aws4EncryptionFactory) {
        StringBuilder canonicalRequestBuilder = new StringBuilder("");
        canonicalRequestBuilder = canonicalRequestBuilder.append(requestMethod).append("\n");
        canonicalRequestBuilder = canonicalRequestBuilder.append(AWS4EncryptionUtils.getCanonicalizedResourcePath(aws4EncryptionFactory.getPath(), true)).append("\n");
        if (requestMethod.toUpperCase().equals("GET") && aws4EncryptionFactory.getRequestParam() != null) {
            String requestParamUri = AWS4EncryptionFactory.getRequestParamUri(aws4EncryptionFactory.getRequestParam());
            canonicalRequestBuilder = canonicalRequestBuilder.append(requestParamUri).append("\n");
        } else {
            canonicalRequestBuilder.append("\n");
        }
        if (aws4EncryptionFactory.getHead() != null) {
            aws4EncryptionFactory.setHeadMap("x-amz-date", aws4EncryptionFactory.getFormattedTimestamp());
            StringBuilder headBuilder = new StringBuilder("");
            List keyList = aws4EncryptionFactory.getHead().keySet().stream().sorted().collect(Collectors.toList());
            keyList.stream().forEach(key -> headBuilder.append((String)key).append(":").append(aws4EncryptionFactory.getHead().get(key)).append("\n"));
            canonicalRequestBuilder = canonicalRequestBuilder.append(headBuilder.toString()).append("\n");
            String headKey = StringUtils.join(keyList, (String)";");
            canonicalRequestBuilder = canonicalRequestBuilder.append(headKey).append("\n");
            aws4EncryptionFactory.setHeadKey(headKey);
        }
        canonicalRequestBuilder = canonicalRequestBuilder.append(contentSha256);
        return canonicalRequestBuilder.toString();
    }

    private static String getCanonicalizedResourcePath(String resourcePath, boolean urlEncode) {
        if (resourcePath != null && !resourcePath.isEmpty()) {
            String value = urlEncode ? SdkHttpUtils.urlEncode(resourcePath, true) : resourcePath;
            return value.startsWith("/") ? value : "/".concat(value);
        }
        return "/";
    }

    public static String getFormattedTimestamp() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        return sdf.format(new Date());
    }

    public static String getDateStamp() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        return sdf.format(new Date());
    }

    private static byte[] newSigningKey(String key, String dateStamp, String regionName, String serviceName) {
        byte[] kSecret = ("AWS4" + key).getBytes(Charset.forName("UTF-8"));
        byte[] kDate = AWS4EncryptionUtils.sign(dateStamp, kSecret, SigningAlgorithm.HmacSHA256);
        byte[] kRegion = AWS4EncryptionUtils.sign(regionName, kDate, SigningAlgorithm.HmacSHA256);
        byte[] kService = AWS4EncryptionUtils.sign(serviceName, kRegion, SigningAlgorithm.HmacSHA256);
        return AWS4EncryptionUtils.sign("aws4_request", kService, SigningAlgorithm.HmacSHA256);
    }

    private static byte[] sign(String stringData, byte[] key, SigningAlgorithm algorithm) throws KscClientException {
        try {
            byte[] data = stringData.getBytes(StandardCharsets.UTF_8);
            return AWS4EncryptionUtils.sign(data, key, algorithm);
        }
        catch (Exception var5) {
            throw new KscClientException("Unable to calculate a request signature: " + var5.getMessage(), (Throwable)var5);
        }
    }

    private static byte[] sign(byte[] data, byte[] key, SigningAlgorithm algorithm) throws KscClientException {
        try {
            Mac mac = Mac.getInstance(algorithm.toString());
            mac.init(new SecretKeySpec(key, algorithm.toString()));
            return mac.doFinal(data);
        }
        catch (Exception var5) {
            throw new KscClientException("Unable to calculate a request signature: " + var5.getMessage(), (Throwable)var5);
        }
    }
}

