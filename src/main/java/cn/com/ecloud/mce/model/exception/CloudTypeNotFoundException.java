package cn.com.ecloud.mce.model.exception;

/**
 * Created by kevin on 2018/1/8.
 */
public class CloudTypeNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public CloudTypeNotFoundException(String message) {
        super(message);
    }

    public CloudTypeNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public CloudTypeNotFoundException(Throwable cause) {
        super(cause);
    }
}
