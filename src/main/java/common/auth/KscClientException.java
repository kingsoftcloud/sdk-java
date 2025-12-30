package common.auth;

/**
 * KSC 客户端异常
 * 替代 com.ksc.KscClientException
 */
public class KscClientException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public KscClientException(String message) {
        super(message);
    }

    public KscClientException(String message, Throwable cause) {
        super(message, cause);
    }

    public KscClientException(Throwable cause) {
        super(cause);
    }
}
