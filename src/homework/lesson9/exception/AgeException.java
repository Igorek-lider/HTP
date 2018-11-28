package homework.lesson9.exception;


public class AgeException extends Exception {

    private final String customExceptionInfo;

    public AgeException(String customExceptionInfo) {
        this.customExceptionInfo = customExceptionInfo;
    }

    public String getCustomExceptionInfo() {
        return customExceptionInfo;
    }
}
