public class MathTest {

    public int nhan(int a, int b) {
        return a * b;
    }

    public int chia(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Không thể chia cho 0");
        }
        return a / b;
    }

    public double tinhTrungBinh(int[] so) {
        if (so.length == 0) {
            throw new ArithmeticException("Không thể tính trung bình của danh sách trống");
        }
        int tong = 0;
        for (int so1 : so) {
            tong += so1;
        }
        return tong / (double) so.length;
    }

    public int layPhanTuTaiChiSo(int[] mang, int chiSo) {
        if (chiSo < 0 || chiSo >= mang.length) {
            throw new IndexOutOfBoundsException("Chỉ mục ngoài phạm vi");
        }
        return mang[chiSo];
    }

    public int timMin(int[] mang) {
        if (mang.length == 0) {
            throw new IllegalArgumentException("Mảng không thể rỗng");
        }
        int min = mang[0];
        for (int so : mang) {
            if (so < min) {
                min = so;
            }
        }
        return min;
    }
}
