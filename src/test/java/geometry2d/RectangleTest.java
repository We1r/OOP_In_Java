package geometry2d;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import exeption.*;

public class RectangleTest {

    @Test
    public void testValidRectangleArea() {
        Rectangle rectangle = new Rectangle(4, 5);  // Ширина 4, высота 5
        assertEquals(20, rectangle.area(), 0.001);  // Площадь: 4 * 5
    }

    @Test
    public void testInvalidRectangleWidth() {
        // Ожидаем выброс исключения IllegalArgumentException при отрицательной ширине
        assertThrows(InvalidDimensionError.class, () -> {
            new Rectangle(-1, 5);  // Ширина не может быть отрицательной
        });
    }

    @Test
    public void testInvalidRectangleHeight() {
        // Ожидаем выброс исключения IllegalArgumentException при отрицательной высоте
        assertThrows(InvalidDimensionError.class, () -> {
            new Rectangle(4, -2);  // Высота не может быть отрицательной
        });
    }

    @Test
    public void testToString() {
        Rectangle rectangle = new Rectangle(3, 6);
        assertEquals("Прямоугольник с шириной 3.0 и высотой 6.0", rectangle.toString());  // Проверяем строковое представление
    }
}
