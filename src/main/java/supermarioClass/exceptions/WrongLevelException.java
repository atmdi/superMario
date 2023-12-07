package supermarioClass.exceptions;

public class WrongLevelException extends  RuntimeException{
    String status;

    public WrongLevelException() {
        this.status = status;
    }

    public WrongLevelException(String message, String status) {
        super(message);
        this.status = status;
    }

    public WrongLevelException(String message, Throwable cause, String status) {
        super(message, cause);
        this.status = status;
    }

    public WrongLevelException(Throwable cause, String status) {
        super(cause);
        this.status = status;
    }

    public WrongLevelException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String status) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.status = status;
    }
}
