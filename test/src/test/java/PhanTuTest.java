import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhanTuTest {

    MathTest mathTest = new MathTest();

    @Test
    void testLayPhanTuTaiChiSo_ChiSoHopLe() {
        assertEquals(3, mathTest.layPhanTuTaiChiSo(new int[]{1, 2, 3}, 2));
    }

    @Test
    void testLayPhanTuTaiChiSo_ChiSoNgoaiPhamVi() {
        assertThrows(IndexOutOfBoundsException.class, () -> mathTest.layPhanTuTaiChiSo(new int[]{1, 2, 3}, 5));
    }

    @Test
    void testLayPhanTuTaiChiSo_ChiSoAm() {
        assertThrows(IndexOutOfBoundsException.class, () -> mathTest.layPhanTuTaiChiSo(new int[]{1, 2, 3}, -1));
    }

    @Test
    void testLayPhanTuTaiChiSo_ChiSoGiua() {
        assertEquals(2, mathTest.layPhanTuTaiChiSo(new int[]{1, 2, 3}, 1));
    }
}