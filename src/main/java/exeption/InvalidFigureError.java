package exeption;

public class InvalidFigureError extends RuntimeException {
    public InvalidFigureError(String message) {
        super(message);
    }
}
