package supermarioClass.exceptions;

public class WrongChallengeException extends  Exception{
    String status;

    public WrongChallengeException(String status) {
        this.status = status;
    }

    public WrongChallengeException(String message, String status) {
        super(message);
        this.status = status;
    }

    public WrongChallengeException(String message, Throwable cause, String status) {
        super(message, cause);
        this.status = status;
    }

    public WrongChallengeException(Throwable cause, String status) {
        super(cause);
        this.status = status;
    }

    public WrongChallengeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String status) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.status = status;
    }
}
