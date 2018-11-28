package homework.lesson9.exception;


public class CountryException extends Exception {

    private final String customExceptionInfo;

    public CountryException(String customExceptionInfo) {
        this.customExceptionInfo = customExceptionInfo;
    }

    public String getCustomExceptionInfo() {
        return customExceptionInfo;
    }
}
