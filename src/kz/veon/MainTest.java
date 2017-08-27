package kz.veon;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testSummOfInteger() {
        Main main = new Main();
        int result = main.summOfInteger(123);
        assertEquals(6, result);
    }
}