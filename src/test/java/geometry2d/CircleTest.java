package geometry2d;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import exeption.*;

public class CircleTest {

    @Test
    public void testValidCircleArea() {
        Circle circle = new Circle(5);
        assertEquals(Math.PI * 25, circle.area(), 0.001);
        assertEquals("Окружность с радиусом 5.0", circle.toString());
    }

    @Test
    public void testInvalidCircleRadius() {
        assertThrows(InvalidDimensionError.class, () -> {
            new Circle(-1);
        });
    }
}
