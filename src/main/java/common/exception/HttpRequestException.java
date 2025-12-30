/*
 * Decompiled with CFR 0.152.
 */
package common.exception;

public class HttpRequestException
extends RuntimeException {
    private String errorCode;
    private String errorMsg;

    public HttpRequestException(String errorCode, String errorMsg) {
        super(errorMsg);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }
}

