/*
 * Decompiled with CFR 0.152.
 */
package common.exception;

public class ClientException
extends RuntimeException {
    private String errorCode;
    private String errorMsg;

    public ClientException(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }
}

