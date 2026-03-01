import java.util.Scanner;
public class quydoitiente {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khai báo tỷ giá cố định theo đề bài
        double TY_GIA_USD = 23500;
        double TY_GIA_EUR = 27000;

        System.out.println("--- CHƯƠNG TRÌNH QUY ĐỔI TIỀN TỆ ---");
        System.out.println("1. Đổi từ USD sang VND");
        System.out.println("2. Đổi từ EUR sang VND");
        System.out.print("Vui lòng chọn (1 hoặc 2): ");
        int luaChon = scanner.nextInt();

        double soTienNgoaiTe, thanhTienVND;

        switch (luaChon) {
            case 1:
                System.out.print("Nhập số tiền USD: ");
                soTienNgoaiTe = scanner.nextDouble();
                thanhTienVND = soTienNgoaiTe * TY_GIA_USD;
                System.out.printf("%.2f USD = %,.0f VND\n", soTienNgoaiTe, thanhTienVND);
                break;
            case 2:
                System.out.print("Nhập số tiền EUR: ");
                soTienNgoaiTe = scanner.nextDouble();
                thanhTienVND = soTienNgoaiTe * TY_GIA_EUR;
                System.out.printf("%.2f EUR = %,.0f VND\n", soTienNgoaiTe, thanhTienVND);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ. Vui lòng chạy lại chương trình!");
        }

        scanner.close();
    }
}
