package thigk2.nguyentuanthanh;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.Year;

public class main {
	// Tóm tắt cách giải: Dùng ArrayList lưu trữ đối tượng SinhVien. 
    // - Khởi tạo sẵn 3 sinh viên (hard-code) và in ra.
    // - Dùng Scanner nhập thêm 1 sinh viên, xử lý trôi lệnh bằng nextLine().
    // - Lọc sinh viên tuổi > 20 bằng cách lấy năm hiện tại (Year.now()) trừ năm sinh.
    public static void main(String[] args) {
        ArrayList<SinhVien> danhSach = new ArrayList<>();
        
        // 1. Hard-code tạo danh sách 3 sinh viên
        danhSach.add(new SinhVien("SV01", "Nguyen Van A", 2005, "Cong nghe thong tin"));
        danhSach.add(new SinhVien("SV02", "Le Thi B", 2006, "Khoa hoc may tinh"));
        danhSach.add(new SinhVien("SV03", "Tran Van C", 2004, "He thong thong tin"));
        
        System.out.println("--- DANH SÁCH 3 SINH VIÊN BAN ĐẦU ---");
        for (SinhVien sv : danhSach) {
            System.out.println(sv.toString());
        }
        
        // (Các đoạn code tiếp theo sẽ viết tiếp vào đây...)
    }
}
