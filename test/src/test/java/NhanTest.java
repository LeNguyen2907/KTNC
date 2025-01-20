import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class NhanTest {
    MathTest mathTest = new MathTest();

    @Test
    void testTinhTich_SoHopLe() {
        assertEquals(6, mathTest.nhan(2, 3));
    }

    @Test
    void testTinhTich_SoAm() {
        assertEquals(-6, mathTest.nhan(-2, 3));
    }

    @Test
    void testTinhTich_Zero() {
        assertEquals(0, mathTest.nhan(0, 3));
    }

    @Test
    void testTinhTich_GiaTriLonNhat() {
        assertEquals(Integer.MAX_VALUE, mathTest.nhan(1, Integer.MAX_VALUE));
    }

    @Test
    void testTinhTich_GiaTriNhoNhat() {
        assertEquals(Integer.MIN_VALUE, mathTest.nhan(-1, Integer.MIN_VALUE));
    }

    @Test
    void testTinhTich_SoLon() {
        assertEquals(1000000, mathTest.nhan(1000, 1000));
    }

    @Test
    void testTinhTich_SoAmLonNhat() {
        assertEquals(-Integer.MAX_VALUE, mathTest.nhan(-1, Integer.MAX_VALUE));
    }

    @Test
    void testTinhTich_SoAmNho() {
        assertEquals(1, mathTest.nhan(-1, -1));
    }

    @Test
    void testTinhTich_SoDuongNho() {
        assertEquals(1, mathTest.nhan(1, 1));
    }
}