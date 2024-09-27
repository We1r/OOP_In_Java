package geometry3d;

import exeption.*;
import geometry2d.*;

public class Cylinder implements Figure {
    private Figure base;
    private double height;

    public Cylinder(Figure base, double height) {
        if (height < 0) {
            throw new InvalidDimensionError("Высота должна быть положительной");
        }
        this.base = base;
        this.height = height;
    }

    public double volume() {
        return base.area() * height;
    }

    @Override
    public double area() {
        if (base instanceof Circle) {
            Circle circle = (Circle) base;
            double radius = circle.area() / Math.PI;
            return 2 * Math.PI * radius * height + 2 * circle.area();
        }
        return base.area() * height + 2 * base.area();
    }

    @Override
    public String toString() {
        return "Цилиндр с основанием " + base.toString() + " и высотой " + height;
    }
}
