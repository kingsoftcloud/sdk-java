/*
 * Decompiled with CFR 0.152.
 */
package common.constant;

public enum RequestMethodEnum {
    POST("post"),
    GET("get"),
    PUT("put"),
    DELETE("delete"),
    HEAD("head"),
    OPTIONS("options"),
    PATCH("patch");

    private final String method;

    private RequestMethodEnum(String method) {
        this.method = method;
    }

    public String getMethod() {
        return this.method;
    }
}

