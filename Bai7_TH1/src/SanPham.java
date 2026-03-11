public class SanPham {
    // 1. Cac thuoc tinh private
    private String maSP;
    private String tenSP;
    private double gia;
    private int soLuong;

    // 2. Constructor mac dinh
    public SanPham() {
    }

    // 2. Constructor co tham so
    public SanPham(String maSP, String tenSP, double gia, int soLuong) {
        setMaSP(maSP);
        setTenSP(tenSP);
        setGia(gia);
        setSoLuong(soLuong);
    }

    // 3. Getter va Setter voi validation
    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        if (maSP != null && !maSP.trim().isEmpty()) {
            this.maSP = maSP;
        } else {
            System.out.println("Loi: Ma SP khong duoc de trong!");
        }
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        if (gia > 0) {
            this.gia = gia;
        } else {
            System.out.println("Loi: Gia phai lon hon 0!");
        }
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            System.out.println("Loi: So luong phai lon hon hoac bang 0!");
        }
    }

    // 4. Phuong thuc tinh thanh tien
    public double tinhThanhTien() {
        return this.gia * this.soLuong;
    }

    // 5. Phuong thuc hien thi thong tin
    public void hienThiThongTin() {
        System.out.println("--- Thong Tin San Pham ---");
        System.out.println("Ma SP: " + maSP);
        System.out.println("Ten SP: " + tenSP);
        System.out.println("Gia: " + gia);
        System.out.println("So Luong: " + soLuong);
        System.out.println("Thanh Tien: " + tinhThanhTien());
    }
}