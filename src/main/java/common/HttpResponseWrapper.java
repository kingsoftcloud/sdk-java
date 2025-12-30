package common;

/**
 * HTTP 响应包装类
 * 包含状态码和原始响应消息,用于 WithContextV2 方法
 *
 * @author SDK Generator
 * @version 1.0
 */
public class HttpResponseWrapper {

    /**
     * HTTP 状态码
     */
    private int statusCode;

    /**
     * 原始响应消息(JSON 字符串)
     */
    private String message;

    /**
     * 异常信息(如果请求失败)
     */
    private Exception exception;

    public HttpResponseWrapper(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public HttpResponseWrapper(Exception exception) {
        this.statusCode = 0;
        this.exception = exception;
    }

    /**
     * 检查响应是否成功
     * @return true 如果状态码在 200-299 之间
     */
    public boolean isSuccess() {
        return statusCode >= 200 && statusCode < 300;
    }

    /**
     * 检查是否有异常
     * @return true 如果存在异常
     */
    public boolean hasException() {
        return exception != null;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

    @Override
    public String toString() {
        if (exception != null) {
            return "HttpResponseWrapper{statusCode=0, exception=" + exception.getMessage() + "}";
        }
        return "HttpResponseWrapper{statusCode=" + statusCode + ", message='" + message + "'}";
    }
}
