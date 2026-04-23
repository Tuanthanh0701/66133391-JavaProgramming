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
        ArrayList<Sinhvien> danhSach = new ArrayList<>();
        
        // 1. Hard-code tạo danh sách 3 sinh viên
        danhSach.add(new Sinhvien("SV01", "Nguyen Van A", 2005, "Cong nghe thong tin"));
        danhSach.add(new Sinhvien("SV02", "Le Thi B", 2006, "Khoa hoc may tinh"));
        danhSach.add(new Sinhvien("SV03", "Tran Van C", 2004, "He thong thong tin"));
        
        System.out.println("--- DANH SÁCH 3 SINH VIÊN BAN ĐẦU ---");
        for (Sinhvien sv : danhSach) {
            System.out.println(sv.toString());
        }
        
     // 2. Thêm mới một sinh viên từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- NHẬP THÔNG TIN SINH VIÊN MỚI ---");
        
        System.out.print("Nhập mã SV: ");
        String maMoi = sc.nextLine();
        
        System.out.print("Nhập họ tên: ");
        String tenMoi = sc.nextLine();
        
        System.out.print("Nhập năm sinh: ");
        int namMoi = sc.nextInt();
        sc.nextLine(); // QUAN TRỌNG: Xóa bộ đệm enter để không bị trôi lệnh nhập chuyên ngành
        
        System.out.print("Nhập chuyên ngành: ");
        String nganhMoi = sc.nextLine();
        
        // Tạo đối tượng và thêm vào list
        Sinhvien svMoi = new Sinhvien(maMoi, tenMoi, namMoi, nganhMoi);
        danhSach.add(svMoi);
        
        // 3. In lại danh sách các sinh viên
        System.out.println("\n--- DANH SÁCH SINH VIÊN SAU KHI THÊM ---");
        for (Sinhvien sv : danhSach) {
            System.out.println(sv.toString());
        }
        
         // 4. In danh sách sinh viên lớn hơn 20 tuổi (theo năm thực tế trên máy)
            int namHienTai = Year.now().getValue(); // Lấy năm hiện tại của hệ thống
            
            System.out.println("\n--- DANH SÁCH SINH VIÊN LỚN HƠN 20 TUỔI ---");
            boolean coSinhVien = false; // Biến cờ để kiểm tra xem có ai thỏa mãn không
            
            for (Sinhvien sv : danhSach) {
                int tuoi = namHienTai - sv.getNamSinh();
                if (tuoi > 20) {
                    System.out.println(sv.toString() + " (Tuổi: " + tuoi + ")");
                    coSinhVien = true;
                }
            }
            
            if (!coSinhVien) {
                System.out.println("Không có sinh viên nào trên 20 tuổi.");
            }
            
            sc.close(); // Đóng scanner cho đúng chuẩn
        }	
    }

