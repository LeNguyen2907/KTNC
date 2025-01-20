import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChiaTest {
    MathTest mathTest = new MathTest();

    @Test
    void testChia_HopLe() {
        assertEquals(2, mathTest.chia(6, 3));
    }

    @Test
    void testChia_ChiaChoKhong() {
        assertThrows(ArithmeticException.class, () -> mathTest.chia(1, 0));
    }

    @Test
    void testChia_ThuongBangKhong() {
        assertEquals(0, mathTest.chia(0, 3));
    }

    @Test
    void testChia_ThuongAm() {
        assertEquals(-2, mathTest.chia(-6, 3));
    }

    @Test
    void testChia_ThuongAmVaAm() {
        assertEquals(-2, mathTest.chia(6, -3));
    }

    @Test
    void testChia_SoNho() {
        assertEquals(1, mathTest.chia(2, 2));
    }

    @Test
    void testChia_GiaTriLonNhat() {
        assertEquals(Integer.MAX_VALUE, mathTest.chia(Integer.MAX_VALUE, 1));
    }

    @Test
    void testChia_GiaTriNhoNhat() {
        assertEquals(Integer.MIN_VALUE, mathTest.chia(Integer.MIN_VALUE, 1));
    }

    @Test
    void testChia_SoLon() {
        assertEquals(500, mathTest.chia(1000, 2));
    }

    @Test
    void testChia_SoAmLon() {
        assertEquals(-500, mathTest.chia(-1000, 2));
    }
}