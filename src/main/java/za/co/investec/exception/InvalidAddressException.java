package za.co.investec.exception;

public class InvalidAddressException extends Throwable {
    private String errorMessage;

    public InvalidAddressException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
