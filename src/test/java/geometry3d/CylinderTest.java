package geometry3d;

import exeption.*;
import geometry2d.Circle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CylinderTest {

    @Test
    public void testCylinderVolume() {
        Circle circle = new Circle(3);
        Cylinder cylinder = new Cylinder(circle, 10);
        assertEquals(282.7433, cylinder.volume(), 0.0001);
        assertEquals("Цилиндр с основанием Окружность с радиусом 3.0 и высотой 10.0", cylinder.toString());
    }

    @Test
    public void testInvalidCylinderHeight() {
        assertThrows(InvalidDimensionError.class, () -> {
            Circle base = new Circle(3);
            new Cylinder(base, -1);
        });
    }
}
