/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package common.aws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Deprecated
public class AWS4EncryptionFactory {
    private static final Logger log = LoggerFactory.getLogger(AWS4EncryptionFactory.class);
    public static final String X_AMZ_DATA = "x-amz-date";
    public static final String X_Authorization = "Authorization";
    public static final String HOST = "host";
    private String algorithm = "AWS4-HMAC-SHA256";
    private String formattedTimestamp;
    private String timeStamp;
    private String accessKey;
    private String secretKey;
    private String service;
    private String region;
    private String version;
    private String action;
    private String path;
    private Map<String, String> head;
    private Map<String, Object> requestParam;
    private String body;
    private String credentialScope;
    private String headKey;

    public AWS4EncryptionFactory(String accessKey, String secretKey, String service, String region) {
        this.accessKey = accessKey;
        this.secretKey = secretKey;
        this.service = service;
        this.region = region;
        this.timeStamp = AWS4EncryptionUtils.getDateStamp();
        this.formattedTimestamp = AWS4EncryptionUtils.getFormattedTimestamp();
        if (this.head == null) {
            this.head = new HashMap<String, String>();
        }
        if (this.requestParam == null) {
            this.requestParam = new HashMap<String, Object>();
        }
    }

    public Map<String, Object> setParamMap(String key, Object value) {
        this.requestParam.put(key, value);
        return this.requestParam;
    }

    public Map<String, String> setHeadMap(String key, String value) {
        this.head.put(key, value);
        return this.head;
    }

    public void generateSignature(String requestMethod) {
        try {
            AWS4EncryptionUtils.generateSignature(this, requestMethod);
        }
        catch (Exception exception) {
            log.info("generateSignature occur error:", (Throwable)exception);
        }
    }

    public static String getRequestParamUri(Map<String, Object> requestParamMap) {
        StringBuilder params = new StringBuilder("");
        List keyList = requestParamMap.keySet().stream().sorted().collect(Collectors.toList());
        keyList.stream().forEach(key -> {
            params.append("&");
            params.append((String)key);
            params.append("=");
            params.append(URLEncoder.encode(String.valueOf(requestParamMap.get(key))));
        });
        return params.toString().substring(1);
    }

    public String getAlgorithm() {
        return this.algorithm;
    }

    public String getFormattedTimestamp() {
        return this.formattedTimestamp;
    }

    public String getTimeStamp() {
        return this.timeStamp;
    }

    public String getAccessKey() {
        return this.accessKey;
    }

    public String getSecretKey() {
        return this.secretKey;
    }

    public String getService() {
        return this.service;
    }

    public String getRegion() {
        return this.region;
    }

    public String getVersion() {
        return this.version;
    }

    public String getAction() {
        return this.action;
    }

    public String getPath() {
        return this.path;
    }

    public Map<String, String> getHead() {
        return this.head;
    }

    public Map<String, Object> getRequestParam() {
        return this.requestParam;
    }

    public String getBody() {
        return this.body;
    }

    public String getCredentialScope() {
        return this.credentialScope;
    }

    public String getHeadKey() {
        return this.headKey;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public void setFormattedTimestamp(String formattedTimestamp) {
        this.formattedTimestamp = formattedTimestamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public void setService(String service) {
        this.service = service;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setHead(Map<String, String> head) {
        this.head = head;
    }

    public void setRequestParam(Map<String, Object> requestParam) {
        this.requestParam = requestParam;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setCredentialScope(String credentialScope) {
        this.credentialScope = credentialScope;
    }

    public void setHeadKey(String headKey) {
        this.headKey = headKey;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AWS4EncryptionFactory)) {
            return false;
        }
        AWS4EncryptionFactory other = (AWS4EncryptionFactory)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$algorithm = this.getAlgorithm();
        String other$algorithm = other.getAlgorithm();
        if (this$algorithm == null ? other$algorithm != null : !this$algorithm.equals(other$algorithm)) {
            return false;
        }
        String this$formattedTimestamp = this.getFormattedTimestamp();
        String other$formattedTimestamp = other.getFormattedTimestamp();
        if (this$formattedTimestamp == null ? other$formattedTimestamp != null : !this$formattedTimestamp.equals(other$formattedTimestamp)) {
            return false;
        }
        String this$timeStamp = this.getTimeStamp();
        String other$timeStamp = other.getTimeStamp();
        if (this$timeStamp == null ? other$timeStamp != null : !this$timeStamp.equals(other$timeStamp)) {
            return false;
        }
        String this$accessKey = this.getAccessKey();
        String other$accessKey = other.getAccessKey();
        if (this$accessKey == null ? other$accessKey != null : !this$accessKey.equals(other$accessKey)) {
            return false;
        }
        String this$secretKey = this.getSecretKey();
        String other$secretKey = other.getSecretKey();
        if (this$secretKey == null ? other$secretKey != null : !this$secretKey.equals(other$secretKey)) {
            return false;
        }
        String this$service = this.getService();
        String other$service = other.getService();
        if (this$service == null ? other$service != null : !this$service.equals(other$service)) {
            return false;
        }
        String this$region = this.getRegion();
        String other$region = other.getRegion();
        if (this$region == null ? other$region != null : !this$region.equals(other$region)) {
            return false;
        }
        String this$version = this.getVersion();
        String other$version = other.getVersion();
        if (this$version == null ? other$version != null : !this$version.equals(other$version)) {
            return false;
        }
        String this$action = this.getAction();
        String other$action = other.getAction();
        if (this$action == null ? other$action != null : !this$action.equals(other$action)) {
            return false;
        }
        String this$path = this.getPath();
        String other$path = other.getPath();
        if (this$path == null ? other$path != null : !this$path.equals(other$path)) {
            return false;
        }
        Map<String, String> this$head = this.getHead();
        Map<String, String> other$head = other.getHead();
        if (this$head == null ? other$head != null : !((Object)this$head).equals(other$head)) {
            return false;
        }
        Map<String, Object> this$requestParam = this.getRequestParam();
        Map<String, Object> other$requestParam = other.getRequestParam();
        if (this$requestParam == null ? other$requestParam != null : !((Object)this$requestParam).equals(other$requestParam)) {
            return false;
        }
        String this$body = this.getBody();
        String other$body = other.getBody();
        if (this$body == null ? other$body != null : !this$body.equals(other$body)) {
            return false;
        }
        String this$credentialScope = this.getCredentialScope();
        String other$credentialScope = other.getCredentialScope();
        if (this$credentialScope == null ? other$credentialScope != null : !this$credentialScope.equals(other$credentialScope)) {
            return false;
        }
        String this$headKey = this.getHeadKey();
        String other$headKey = other.getHeadKey();
        return !(this$headKey == null ? other$headKey != null : !this$headKey.equals(other$headKey));
    }

    protected boolean canEqual(Object other) {
        return other instanceof AWS4EncryptionFactory;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $algorithm = this.getAlgorithm();
        result = result * 59 + ($algorithm == null ? 43 : $algorithm.hashCode());
        String $formattedTimestamp = this.getFormattedTimestamp();
        result = result * 59 + ($formattedTimestamp == null ? 43 : $formattedTimestamp.hashCode());
        String $timeStamp = this.getTimeStamp();
        result = result * 59 + ($timeStamp == null ? 43 : $timeStamp.hashCode());
        String $accessKey = this.getAccessKey();
        result = result * 59 + ($accessKey == null ? 43 : $accessKey.hashCode());
        String $secretKey = this.getSecretKey();
        result = result * 59 + ($secretKey == null ? 43 : $secretKey.hashCode());
        String $service = this.getService();
        result = result * 59 + ($service == null ? 43 : $service.hashCode());
        String $region = this.getRegion();
        result = result * 59 + ($region == null ? 43 : $region.hashCode());
        String $version = this.getVersion();
        result = result * 59 + ($version == null ? 43 : $version.hashCode());
        String $action = this.getAction();
        result = result * 59 + ($action == null ? 43 : $action.hashCode());
        String $path = this.getPath();
        result = result * 59 + ($path == null ? 43 : $path.hashCode());
        Map<String, String> $head = this.getHead();
        result = result * 59 + ($head == null ? 43 : ((Object)$head).hashCode());
        Map<String, Object> $requestParam = this.getRequestParam();
        result = result * 59 + ($requestParam == null ? 43 : ((Object)$requestParam).hashCode());
        String $body = this.getBody();
        result = result * 59 + ($body == null ? 43 : $body.hashCode());
        String $credentialScope = this.getCredentialScope();
        result = result * 59 + ($credentialScope == null ? 43 : $credentialScope.hashCode());
        String $headKey = this.getHeadKey();
        result = result * 59 + ($headKey == null ? 43 : $headKey.hashCode());
        return result;
    }

    public String toString() {
        return "AWS4EncryptionFactory(algorithm=" + this.getAlgorithm() + ", formattedTimestamp=" + this.getFormattedTimestamp() + ", timeStamp=" + this.getTimeStamp() + ", accessKey=" + this.getAccessKey() + ", secretKey=" + this.getSecretKey() + ", service=" + this.getService() + ", region=" + this.getRegion() + ", version=" + this.getVersion() + ", action=" + this.getAction() + ", path=" + this.getPath() + ", head=" + this.getHead() + ", requestParam=" + this.getRequestParam() + ", body=" + this.getBody() + ", credentialScope=" + this.getCredentialScope() + ", headKey=" + this.getHeadKey() + ")";
    }
}

