/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonProperty
 */
package common;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BaseResponseModel {
    @JsonProperty(value="RequestId")
    private String requestId;
    @JsonProperty(value="Error")
    private ErrorDto error;
    @JsonProperty(value="result")
    private String result;

    public String getRequestId() {
        return this.requestId;
    }

    public ErrorDto getError() {
        return this.error;
    }

    public String getResult() {
        return this.result;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public void setError(ErrorDto error) {
        this.error = error;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof BaseResponseModel)) {
            return false;
        }
        BaseResponseModel other = (BaseResponseModel)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$requestId = this.getRequestId();
        String other$requestId = other.getRequestId();
        if (this$requestId == null ? other$requestId != null : !this$requestId.equals(other$requestId)) {
            return false;
        }
        ErrorDto this$error = this.getError();
        ErrorDto other$error = other.getError();
        if (this$error == null ? other$error != null : !((Object)this$error).equals(other$error)) {
            return false;
        }
        String this$result = this.getResult();
        String other$result = other.getResult();
        return !(this$result == null ? other$result != null : !this$result.equals(other$result));
    }

    protected boolean canEqual(Object other) {
        return other instanceof BaseResponseModel;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $requestId = this.getRequestId();
        result = result * 59 + ($requestId == null ? 43 : $requestId.hashCode());
        ErrorDto $error = this.getError();
        result = result * 59 + ($error == null ? 43 : ((Object)$error).hashCode());
        String $result = this.getResult();
        result = result * 59 + ($result == null ? 43 : $result.hashCode());
        return result;
    }

    public String toString() {
        return "BaseResponseModel(requestId=" + this.getRequestId() + ", error=" + this.getError() + ", result=" + this.getResult() + ")";
    }

    public static class ErrorDto {
        @JsonProperty(value="Type")
        private String type;
        @JsonProperty(value="Code")
        private String code;
        @JsonProperty(value="Message")
        private String message;

        public String getType() {
            return this.type;
        }

        public String getCode() {
            return this.code;
        }

        public String getMessage() {
            return this.message;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof ErrorDto)) {
                return false;
            }
            ErrorDto other = (ErrorDto)o;
            if (!other.canEqual(this)) {
                return false;
            }
            String this$type = this.getType();
            String other$type = other.getType();
            if (this$type == null ? other$type != null : !this$type.equals(other$type)) {
                return false;
            }
            String this$code = this.getCode();
            String other$code = other.getCode();
            if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
                return false;
            }
            String this$message = this.getMessage();
            String other$message = other.getMessage();
            return !(this$message == null ? other$message != null : !this$message.equals(other$message));
        }

        protected boolean canEqual(Object other) {
            return other instanceof ErrorDto;
        }

        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            String $type = this.getType();
            result = result * 59 + ($type == null ? 43 : $type.hashCode());
            String $code = this.getCode();
            result = result * 59 + ($code == null ? 43 : $code.hashCode());
            String $message = this.getMessage();
            result = result * 59 + ($message == null ? 43 : $message.hashCode());
            return result;
        }

        public String toString() {
            return "BaseResponseModel.ErrorDto(type=" + this.getType() + ", code=" + this.getCode() + ", message=" + this.getMessage() + ")";
        }
    }
}

