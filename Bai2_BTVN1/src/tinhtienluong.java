import java.util.Scanner;
public class tinhtienluong {
	public static void main(String[] args) {
        // Khởi tạo Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // 1. Nhập số giờ làm và lương theo giờ
        System.out.print("Nhập số giờ làm việc: ");
        double soGioLam = scanner.nextDouble();

        System.out.print("Nhập mức lương mỗi giờ: ");
        double luongMoiGio = scanner.nextDouble();

        double tongLuong;

        // 2. Tính tổng lương dựa trên điều kiện
        if (soGioLam <= 40) {
            // Trường hợp làm việc bình thường
            tongLuong = soGioLam * luongMoiGio;
        } else {
            // Trường hợp làm trên 40 giờ (tính thêm 1.5 cho giờ vượt)
            double gioBinhThuong = 40;
            double gioVuot = soGioLam - 40;
            
            tongLuong = (gioBinhThuong * luongMoiGio) + (gioVuot * luongMoiGio * 1.5);
        }

        // 3. Xuất kết quả
        System.out.printf("Tổng lương của nhân viên là: %.2f\n", tongLuong);

        scanner.close();
    }
}
