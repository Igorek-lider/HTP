package homework.lesson9.exception;


public class LoginException extends Exception {

    private final String customExceptionInfo;

    public LoginException(String customExceptionInfo) {
        this.customExceptionInfo = customExceptionInfo;
    }

    public String getCustomExceptionInfo() {
        return customExceptionInfo;
    }
}
