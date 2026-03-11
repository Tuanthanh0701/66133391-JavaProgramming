import java.time.Year;

public class Sach {
    // Thuoc tinh private (dong goi)
    private String maSach;
    private String tenSach;
    private String tacGia;
    private int namXuatBan;
    private boolean trangThai; // true = co san, false = dang muon

    // Constructor voi validation
    public Sach(String maSach, String tenSach, String tacGia, int namXuatBan) {
        if (namXuatBan <= 1900 || namXuatBan > Year.now().getValue()) {
            throw new IllegalArgumentException("Nam xuat ban khong hop le");
        }
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.trangThai = true; // mac dinh co san
    }

    // Phuong thuc muon sach
    public boolean muonSach() {
        if (trangThai) {
            trangThai = false;
            return true;
        }
        return false;
    }

    // Phuong thuc tra sach
    public void traSach() {
        trangThai = true;
    }

    // Kiem tra sach cu
    public boolean kiemTraSachCu() {
        return namXuatBan < 2000;
    }

    // Getter va Setter (dong goi)
    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        if (namXuatBan <= 1900 || namXuatBan > Year.now().getValue()) {
            throw new IllegalArgumentException("Nam xuat ban khong hop le");
        }
        this.namXuatBan = namXuatBan;
    }

    public boolean isTrangThai() {
        return trangThai;
    }
}
