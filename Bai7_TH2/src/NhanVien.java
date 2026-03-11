public class NhanVien {
    // 1. Cac thuoc tinh private
    private String maNV;
    private String hoTen;
    private double luongCoBan;
    private double heSoLuong;

    // 2. Constructor nhan day du thong tin
    public NhanVien(String maNV, String hoTen, double luongCoBan, double heSoLuong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    // 3. Getter va Setter
    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    // 4. Phuong thuc tinh luong
    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }

    // 5. Phuong thuc xep loai
    public String xepLoai() {
        double luong = tinhLuong();
        if (luong >= 20000000) {
            return "Xuat sac";
        } else if (luong >= 15000000) {
            return "Tot";
        } else {
            return "Kha";
        }
    }

    // Phuong thuc hien thi de kiem tra ket qua
    public void hienThiThongTin() {
        System.out.println("Ma NV: " + maNV);
        System.out.println("Ho Ten: " + hoTen);
        System.out.println("Luong: " + tinhLuong());
        System.out.println("Xep Loai: " + xepLoai());
        System.out.println("-----------------------");
    }
}