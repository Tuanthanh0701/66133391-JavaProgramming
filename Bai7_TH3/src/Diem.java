public class Diem {
    // 1. Cac thuoc tinh private (Dong goi)
    private double x;
    private double y;

    // 2. Constructor mac dinh (Khoi tao tai goc toa do 0,0)
    public Diem() {
        this.x = 0;
        this.y = 0;
    }

    // 2. Constructor co tham so
    public Diem(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // 3. Getter va Setter (De truy cap va sua du lieu an toan)
    public double getX() { return x; }
    public void setX(double x) { this.x = x; }

    public double getY() { return y; }
    public void setY(double y) { this.y = y; }

    // 4. Phuong thuc tinh khoang cach giua diem hien tai va diem d
    public double tinhKhoangCach(Diem d) {
        return Math.sqrt(Math.pow(this.x - d.x, 2) + 
                         Math.pow(this.y - d.y, 2));
    }

    // 5. Kiem tra xem 2 diem co trung toa do hay khong
    public boolean kiemTraTrungNhau(Diem d) {
        return this.x == d.x && this.y == d.y;
    }

    // 6. Tim diem doi xung qua goc toa do O(0,0)
    public Diem timDiemDoiXung() {
        // Tra ve mot doi tuong Diem moi co toa do (-x, -y)
        return new Diem(-this.x, -this.y);
    }

    // 7. Phuong thuc in thong tin diem
    public void hienThi() {
        System.out.println("Toa do diem: (" + x + ", " + y + ")");
    }
}