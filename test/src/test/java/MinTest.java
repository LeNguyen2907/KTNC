import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinTest {

    MathTest mathTest = new MathTest();

    @Test
    void testTimMin_MangHopLe() {
        assertEquals(1, mathTest.timMin(new int[]{3, 1, 4, 1, 5}));
    }

    @Test
    void testTimMin_MangRong() {
        assertThrows(IllegalArgumentException.class, () -> mathTest.timMin(new int[]{}));
    }

    @Test
    void testTimMin_MotPhanTu() {
        assertEquals(1, mathTest.timMin(new int[]{1}));
    }

    @Test
    void testTimMin_SoAm() {
        assertEquals(-5, mathTest.timMin(new int[]{-3, -2, -5}));
    }
}