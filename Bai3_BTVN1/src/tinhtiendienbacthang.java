import java.util.Scanner;
public class tinhtiendienbacthang {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Nhập chỉ số điện tiêu thụ
        System.out.print("Nhập số điện tiêu thụ (kWh): ");
        double soDien = scanner.nextDouble();

        double tongTien = 0;

        // 2. Tính toán theo phương pháp lũy tiến (bậc thang)
        // Giả sử các mức giá:
        // Bậc 1: Cho 50 kWh đầu tiên: 1.678 đ/kWh
        // Bậc 2: Cho 50 kWh tiếp theo (51-100): 1.734 đ/kWh
        // Bậc 3: Cho 100 kWh tiếp theo (101-200): 2.014 đ/kWh
        // Bậc 4: Cho số kWh còn lại (>200): 2.536 đ/kWh

        if (soDien <= 50) {
            tongTien = soDien * 1678;
        } else if (soDien <= 100) {
            tongTien = (50 * 1678) + ((soDien - 50) * 1734);
        } else if (soDien <= 200) {
            tongTien = (50 * 1678) + (50 * 1734) + ((soDien - 100) * 2014);
        } else {
            tongTien = (50 * 1678) + (50 * 1734) + (100 * 2014) + ((soDien - 200) * 2536);
        }

        // 3. Xuất kết quả
        // Cộng thêm 10% thuế VAT (nếu cần)
        double thueVAT = tongTien * 0.1;
        double tongThanhToan = tongTien + thueVAT;

        System.out.println("------------------------------------");
        System.out.printf("Tiền điện chưa thuế: %,.0f VND\n", tongTien);
        System.out.printf("Thuế VAT (10%%):      %,.0f VND\n", thueVAT);
        System.out.printf("TỔNG CỘNG:           %,.0f VND\n", tongThanhToan);
        System.out.println("------------------------------------");

        scanner.close();
    }
}
