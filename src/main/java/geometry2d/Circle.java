package geometry2d;
import exeption.*;

public class Circle implements Figure {
    private double radius;

    public Circle(double radius) {
        if (radius < 0) {
            throw new InvalidDimensionError("Радиус должен быть положительным числом");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Окружность с радиусом " + radius;
    }
}
