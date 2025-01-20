import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrungBinhTest {

    MathTest mathTest = new MathTest();

    @Test
    void testTinhTrungBinh_SoHopLe() {
        assertEquals(2.0, mathTest.tinhTrungBinh(new int[]{1, 2, 3}));
    }

    @Test
    void testTinhTrungBinh_DanhSachTrong() {
        assertThrows(ArithmeticException.class, () -> mathTest.tinhTrungBinh(new int[]{}));
    }

    @Test
    void testTinhTrungBinh_MotPhanTu() {
        assertEquals(1.0, mathTest.tinhTrungBinh(new int[]{1}));
    }

    @Test
    void testTinhTrungBinh_SoAm() {
        assertEquals(-2.0, mathTest.tinhTrungBinh(new int[]{-1, -2, -3}));
    }

    @Test
    void testTinhTrungBinh_SoLon() {
        assertEquals(1000000.0, mathTest.tinhTrungBinh(new int[]{1000000, 1000000}));
    }

    @Test
    void testTinhTrungBinh_SoKhong() {
        assertEquals(0.0, mathTest.tinhTrungBinh(new int[]{0, 0, 0}));
    }

    @Test
    void testTinhTrungBinh_SoLonVaBe() {
        assertEquals(2.5, mathTest.tinhTrungBinh(new int[]{1, 4}));
    }
}