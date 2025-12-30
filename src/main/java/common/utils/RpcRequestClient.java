/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSONObject
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.http.HttpEntity
 *  org.apache.http.client.config.RequestConfig
 *  org.apache.http.client.entity.UrlEncodedFormEntity
 *  org.apache.http.client.methods.CloseableHttpResponse
 *  org.apache.http.client.methods.HttpDelete
 *  org.apache.http.client.methods.HttpEntityEnclosingRequestBase
 *  org.apache.http.client.methods.HttpGet
 *  org.apache.http.client.methods.HttpHead
 *  org.apache.http.client.methods.HttpOptions
 *  org.apache.http.client.methods.HttpPatch
 *  org.apache.http.client.methods.HttpPost
 *  org.apache.http.client.methods.HttpPut
 *  org.apache.http.client.methods.HttpRequestBase
 *  org.apache.http.client.methods.HttpUriRequest
 *  org.apache.http.entity.ContentType
 *  org.apache.http.entity.StringEntity
 *  org.apache.http.impl.client.CloseableHttpClient
 *  org.apache.http.impl.client.HttpClients
 *  org.apache.http.message.BasicNameValuePair
 *  org.apache.http.util.EntityUtils
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  software.amazon.awssdk.auth.credentials.AwsBasicCredentials
 *  software.amazon.awssdk.auth.credentials.AwsCredentials
 *  software.amazon.awssdk.auth.signer.Aws4Signer
 *  software.amazon.awssdk.auth.signer.params.Aws4SignerParams
 *  software.amazon.awssdk.http.SdkHttpFullRequest
 *  software.amazon.awssdk.http.SdkHttpFullRequest$Builder
 *  software.amazon.awssdk.http.SdkHttpMethod
 *  software.amazon.awssdk.regions.Region
 *  software.amazon.awssdk.utils.StringInputStream
 *  software.amazon.awssdk.utils.StringUtils
 */
package common.utils;

import com.alibaba.fastjson.JSONObject;
import common.RpcRequestContentModel;
import common.utils.HttpClientUtils;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentials;
import software.amazon.awssdk.auth.signer.Aws4Signer;
import software.amazon.awssdk.auth.signer.params.Aws4SignerParams;
import software.amazon.awssdk.http.SdkHttpFullRequest;
import software.amazon.awssdk.http.SdkHttpMethod;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.utils.StringInputStream;
import software.amazon.awssdk.utils.StringUtils;

public class RpcRequestClient {
    private static final Logger log = LoggerFactory.getLogger(RpcRequestClient.class);
    private static final String DEFAULT_PROTOCOL = "http://";
    private final RpcRequestContentModel rpcRequestContentModel;

    public RpcRequestClient(RpcRequestContentModel rpcRequestContentModel) {
        this.rpcRequestContentModel = rpcRequestContentModel;
    }

    public String beginRpcRequest(String url, String requestMethod, Map<String, Object> requestParams) {
        return this.beginRpcRequest(url, requestMethod, requestParams, new HashMap<String, String>());
    }

    public String beginRpcRequest(String url, String requestMethod, Map<String, Object> requestParam, Map<String, String> head) {
        url = RpcRequestClient.enhanceUrl(url);
        HashMap<String, String> rpcHead = new HashMap<String, String>(head);
        HashMap<String, Object> rpcParam = new HashMap<String, Object>(requestParam);
        try {
            SdkHttpFullRequest unsignedRequest = this.createUnsignedRequest(url, this.paseSdkHttpMethod(requestMethod), rpcParam, rpcHead);
            SdkHttpFullRequest signedRequest = this.signRequest(unsignedRequest, this.rpcRequestContentModel.getAccessKeyId(), this.rpcRequestContentModel.getSecretAccessKey());
            HttpRequestBase httpRequest = this.convertToHttpRequest(signedRequest, rpcParam);
            return this.executeRequest(httpRequest);
        }
        catch (Exception e) {
            log.error("rpc occur error", (Throwable)e);
            throw new RuntimeException(e);
        }
    }

    private SdkHttpMethod paseSdkHttpMethod(String method) {
        if (StringUtils.isEmpty((CharSequence)method)) {
            throw new IllegalArgumentException("method is null");
        }
        switch (method.toLowerCase()) {
            case "get": {
                return SdkHttpMethod.GET;
            }
            case "post": {
                return SdkHttpMethod.POST;
            }
            case "put": {
                return SdkHttpMethod.PUT;
            }
            case "delete": {
                return SdkHttpMethod.DELETE;
            }
            case "head": {
                return SdkHttpMethod.HEAD;
            }
            case "options": {
                return SdkHttpMethod.OPTIONS;
            }
            case "patch": {
                return SdkHttpMethod.PATCH;
            }
        }
        throw new IllegalArgumentException("method is not supported");
    }

    public SdkHttpFullRequest createUnsignedRequest(String endpoint, SdkHttpMethod method, Map<String, Object> requestParam, Map<String, String> head) throws URISyntaxException {
        URI uri = new URI(endpoint);
        SdkHttpFullRequest.Builder builder = SdkHttpFullRequest.builder().method(method).uri(uri);
        if (method == SdkHttpMethod.GET || method == SdkHttpMethod.DELETE || method == SdkHttpMethod.HEAD || method == SdkHttpMethod.OPTIONS) {
            if (requestParam != null) {
                requestParam.entrySet().stream().filter(entry -> entry.getValue() != null).sorted(Map.Entry.comparingByKey()).forEach(entry -> builder.putRawQueryParameter((String)entry.getKey(), entry.getValue().toString()));
            }
        } else if (!(method != SdkHttpMethod.POST && method != SdkHttpMethod.PUT && method != SdkHttpMethod.PATCH || requestParam == null || requestParam.isEmpty())) {
            String contentType = head.getOrDefault("Content-Type", "application/x-www-form-urlencoded");
            if ("application/json".equalsIgnoreCase(contentType)) {
                String jsonBody = this.buildJsonBody(requestParam);
                builder.putHeader("Content-Type", "application/json").contentStreamProvider(() -> new StringInputStream(jsonBody));
            } else {
                String formData = this.buildFormData(requestParam);
                builder.putHeader("Content-Type", "application/x-www-form-urlencoded").contentStreamProvider(() -> new StringInputStream(formData));
            }
        }
        builder.putHeader("Host", uri.getHost());
        builder.putHeader("Accept", "application/json");
        head.forEach((arg_0, arg_1) -> ((SdkHttpFullRequest.Builder)builder).putHeader(arg_0, arg_1));
        return builder.build();
    }

    private SdkHttpFullRequest signRequest(SdkHttpFullRequest request, String accessKeyId, String secretAccessKey) {
        Aws4Signer signer = Aws4Signer.create();
        Aws4SignerParams signerParams = Aws4SignerParams.builder().awsCredentials((AwsCredentials)AwsBasicCredentials.create((String)accessKeyId, (String)secretAccessKey)).signingName(this.rpcRequestContentModel.getService()).signingRegion(Region.of((String)this.rpcRequestContentModel.getRegion())).build();
        return signer.sign(request, signerParams);
    }

    public HttpRequestBase convertToHttpRequest(SdkHttpFullRequest signedRequest, Map<String, Object> requestParam) {
        HttpRequestBase httpRequest = this.createRequestByMethod(signedRequest);
        this.addHeaders(httpRequest, signedRequest);
        this.setRequestContent(httpRequest, signedRequest, requestParam);
        return httpRequest;
    }

    private HttpRequestBase createRequestByMethod(SdkHttpFullRequest signedRequest) {
        switch (signedRequest.method()) {
            case POST: {
                return new HttpPost(signedRequest.getUri());
            }
            case GET: {
                return new HttpGet(signedRequest.getUri());
            }
            case PUT: {
                return new HttpPut(signedRequest.getUri());
            }
            case DELETE: {
                return new HttpDelete(signedRequest.getUri());
            }
            case PATCH: {
                return new HttpPatch(signedRequest.getUri());
            }
            case HEAD: {
                return new HttpHead(signedRequest.getUri());
            }
            case OPTIONS: {
                return new HttpOptions(signedRequest.getUri());
            }
        }
        throw new UnsupportedOperationException("Method not supported: " + signedRequest.method());
    }

    private void addHeaders(HttpRequestBase httpRequest, SdkHttpFullRequest signedRequest) {
        signedRequest.headers().forEach((name, values) -> {
            if (!"Content-Length".equalsIgnoreCase((String)name)) {
                values.forEach(value -> httpRequest.addHeader(name, value));
            }
        });
    }

    private void setRequestContent(HttpRequestBase httpRequest, SdkHttpFullRequest signedRequest, Map<String, Object> requestParam) {
        if (httpRequest instanceof HttpEntityEnclosingRequestBase && requestParam != null) {
            HttpEntityEnclosingRequestBase entityRequest = (HttpEntityEnclosingRequestBase)httpRequest;
            if (signedRequest == null) {
                throw new IllegalArgumentException("Signed request cannot be null");
            }
            String contentType = signedRequest.firstMatchingHeader("Content-Type").map(String::toLowerCase).orElse("application/x-www-form-urlencoded");
            try {
                if (contentType.equalsIgnoreCase("application/json")) {
                    String jsonBody = this.buildJsonBody(requestParam);
                    entityRequest.setEntity((HttpEntity)new StringEntity(jsonBody, ContentType.APPLICATION_JSON));
                } else {
                    ArrayList nameValuePairList = new ArrayList();
                    requestParam.entrySet().stream().filter(entry -> entry.getValue() != null).sorted(Map.Entry.comparingByKey()).forEach(entry -> {
                        BasicNameValuePair basicNameValuePair = new BasicNameValuePair((String)entry.getKey(), this.validateStringValue(entry.getValue()));
                        nameValuePairList.add(basicNameValuePair);
                    });
                    UrlEncodedFormEntity urlEncodedFormEntity = new UrlEncodedFormEntity(nameValuePairList, StandardCharsets.UTF_8);
                    entityRequest.setEntity((HttpEntity)urlEncodedFormEntity);
                }
            }
            catch (Exception e) {
                throw new RuntimeException("Failed to set request entity", e);
            }
        }
    }

    private String validateStringValue(Object value) {
        if (value == null) {
            return "";
        }
        return value.toString();
    }

    private String buildJsonBody(Map<String, Object> requestParam) {
        if (requestParam == null || requestParam.isEmpty()) {
            throw new IllegalArgumentException("\u53c2\u6570\u4e0d\u80fd\u4e3a\u7a7a");
        }
        return JSONObject.toJSONString(requestParam);
    }

    private String buildFormData(Map<String, Object> requestParam) throws IllegalArgumentException {
        if (requestParam == null || requestParam.isEmpty()) {
            throw new IllegalArgumentException("\u53c2\u6570\u4e0d\u80fd\u4e3a\u7a7a");
        }
        try {
            return requestParam.entrySet().stream().filter(entry -> entry.getValue() != null).sorted(Map.Entry.comparingByKey()).map(entry -> {
                try {
                    return URLEncoder.encode((String)entry.getKey(), StandardCharsets.UTF_8.name()) + "=" + URLEncoder.encode(this.validateStringValue(entry.getValue()), StandardCharsets.UTF_8.name());
                }
                catch (UnsupportedEncodingException e) {
                    throw new IllegalStateException("UTF-8\u7f16\u7801\u4e0d\u53ef\u7528", e);
                }
            }).collect(Collectors.joining("&"));
        }
        catch (Exception e) {
            log.error("\u6784\u5efa\u8868\u5355\u6570\u636e\u5931\u8d25", (Throwable)e);
            throw new IllegalArgumentException("\u6784\u5efa\u8868\u5355\u6570\u636e\u5931\u8d25: " + e.getMessage(), e);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String executeRequest(HttpRequestBase httpRequest) {
        log.info("begin rpc request");
        try (CloseableHttpClient httpClient = HttpClients.createDefault();){
            RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(this.rpcRequestContentModel.getSocketTimeout().intValue()).setConnectTimeout(this.rpcRequestContentModel.getConnectTimeout().intValue()).build();
            httpRequest.setConfig(requestConfig);
            String curl = HttpClientUtils.convertHttpClientToCurl(httpRequest);
            log.info("begin rpc request curl:{}", (Object)curl);
            CloseableHttpResponse response = httpClient.execute((HttpUriRequest)httpRequest);
            Objects.requireNonNull(response.getEntity(), "response content is null");
            String result = EntityUtils.toString((HttpEntity)response.getEntity(), (Charset)StandardCharsets.UTF_8);
            JSONObject jsonObject = JSONObject.parseObject((String)result);
            jsonObject.put("result", (Object)result);
            log.info("rpc request end,response:{}", (Object)jsonObject.toJSONString());
            String string = jsonObject.toJSONString();
            return string;
        }
        catch (Exception e) {
            log.info("rpc request occur exception:{}", (Object)e.getMessage());
            throw new RuntimeException("rpc\u8bf7\u6c42\u5931\u8d25", e);
        }
    }

    private static String enhanceUrl(String url) {
        if (org.apache.commons.lang3.StringUtils.isEmpty((CharSequence)url)) {
            return url;
        }
        if (!url.contains("http") || !url.contains("https")) {
            return DEFAULT_PROTOCOL + url;
        }
        return url;
    }
}

