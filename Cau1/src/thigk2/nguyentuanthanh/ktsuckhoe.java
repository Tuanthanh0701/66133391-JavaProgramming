package thigk2.nguyentuanthanh;
import java.util.Scanner;

public class ktsuckhoe {
	// Tóm tắt cách giải: Nhập chiều cao (m) và cân nặng (kg) từ Scanner.
    // Tính BMI = cân nặng / (chiều cao ^ 2). Dùng if-else để phân loại tình trạng.
    public static void main(String[] args) {
    	// Lơp scanner
        Scanner sc = new Scanner(System.in);
        // In thong tin nhap tu ban phim
        System.out.print("Nhập chiều cao (mét, VD: 1,75): ");
        double chieuCao = sc.nextDouble();
        
        System.out.print("Nhập cân nặng (kg): ");
        double canNang = sc.nextDouble();
        
        double bmi = canNang / (chieuCao * chieuCao);
        System.out.println("Chỉ số BMI của bạn là: " + bmi);
        
        // Vong lap de rang buoc dieu kien
        if (bmi < 18.5) {
            System.out.println("Tình trạng: Gầy");
        } else if (bmi < 25) {
            System.out.println("Tình trạng: Bình thường");
        } else if (bmi < 30) {
            System.out.println("Tình trạng: Thừa cân");
        } else {
            System.out.println("Tình trạng: Béo phì");
        }
    }
}
