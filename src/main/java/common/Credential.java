/*
 * Decompiled with CFR 0.152.
 */
package common;

import common.exception.ClientException;
import common.utils.GetUTCTimeUtil;
import java.time.LocalDate;

public class Credential {
    private String secretKey;
    private String signStr;
    private String signatureMethod;
    private String signatureVersion;
    private String timestamp;
    private String region;

    public Credential(String secretKey, String signStr, String region) {
        this.secretKey = secretKey;
        this.signStr = signStr;
        this.region = region;
        this.signatureMethod = "HMAC-SHA256";
        this.signatureVersion = "1.0";
        LocalDate now = LocalDate.now();
        this.timestamp = GetUTCTimeUtil.getUTCTimeStr();
    }

    public String getSecretKey() {
        return this.secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getSignStr() {
        return this.signStr;
    }

    public void setSignStr(String signStr) {
        this.signStr = signStr;
    }

    public String getSignatureMethod() {
        return this.signatureMethod;
    }

    public void setSignatureMethod(String signatureMethod) {
        this.signatureMethod = signatureMethod;
    }

    public String getSignatureVersion() {
        return this.signatureVersion;
    }

    public void setSignatureVersion(String signatureVersion) {
        this.signatureVersion = signatureVersion;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void check() {
        if (this.secretKey == null || this.secretKey == "") {
            throw new ClientException("inner_error", "secretKey is blank");
        }
        if (this.signStr == null || this.signStr == "") {
            throw new ClientException("inner_error", "signStr is blank");
        }
    }

    public String toString() {
        return "Credential{secretKey='" + this.secretKey + '\'' + ", signStr='" + this.signStr + '\'' + ", signatureMethod='" + this.signatureMethod + '\'' + ", signatureVersion='" + this.signatureVersion + '\'' + ", timestamp='" + this.timestamp + '\'' + ", region='" + this.region + '\'' + '}';
    }
}

