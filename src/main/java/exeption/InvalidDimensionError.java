package exeption;

public class InvalidDimensionError extends RuntimeException {
    public InvalidDimensionError(String message) {
        super(message);
    }
}
