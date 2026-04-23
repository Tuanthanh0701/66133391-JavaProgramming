package thigk2.nguyentuanthanh;

public class Sinhvien {
    private String maSV;
    private String hoTen;
    private int namSinh;
    private String chuyenNganh; 

    // Constructor đầy đủ tham số
    public Sinhvien(String maSV, String hoTen, int namSinh, String chuyenNganh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.chuyenNganh = chuyenNganh;
    }

    // Các Getter và Setter
    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    // Ghi đè phương thức toString
    @Override
    public String toString() {
        return "Mã SV: " + maSV + " | Họ tên: " + hoTen + 
               " | Năm sinh: " + namSinh + " | Chuyên ngành: " + chuyenNganh;
    }
}
