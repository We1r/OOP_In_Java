package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.Main.*;
import java.util.Arrays;
import java.util.List;

public class MainTest {

    @Test
    public void testButtonClick() {
        Button btn = new Button();
        assertEquals(0, btn.getClicks());
        btn.click();
        assertEquals(1, btn.getClicks());
        btn.click();
        assertEquals(2, btn.getClicks());
    }

    @Test
    public void testBalance() {
        Balance balance = new   Balance();
        balance.addLeft(10);
        balance.addRight(7);
        assertEquals("L", balance.result());

        balance.addRight(4);
        assertEquals("R", balance.result());

        balance.addLeft(1);
        assertEquals("=", balance.result());
    }

    @Test
    public void testBell() {
        Bell bell = new Bell();
        assertEquals("ding", bell.sound());
        assertEquals("dong", bell.sound());
        assertEquals("ding", bell.sound());
    }

    @Test
    public void testOddEvenSeparator() {
        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(3);
        separator.addNumber(4);
        separator.addNumber(7);
        separator.addNumber(2);
        separator.addNumber(1);

        List<Integer> expectedEven = Arrays.asList(4, 2);
        List<Integer> expectedOdd = Arrays.asList(3, 7, 1);

        assertEquals(expectedEven, separator.even());
        assertEquals(expectedOdd, separator.odd());
    }

    @Test
    public void testTable() {
        Table table = new Table(2, 3);
        table.setValue(0, 0, 10);
        table.setValue(1, 2, 5);
        assertEquals(10, table.getValue(0, 0));
        assertEquals(5, table.getValue(1, 2));
        assertEquals(2, table.rows());
        assertEquals(3, table.cols());
        assertEquals(2.5, table.average(), 0.001);
        //assertEquals("10 0 0 0 0 5", table.toString());
    }


}
