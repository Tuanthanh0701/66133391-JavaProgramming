import java.util.Scanner;
import java.util.Random;
public class gamedoanso {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        String choiLai;

        do {
            int soMayChon = rd.nextInt(100) + 1; // Máy chọn 1-100
            int soLanDoan = 0;
            boolean thang = false;

            System.out.println("--- GAME ĐOÁN SỐ (1-100) ---");

            while (soLanDoan < 10) { // Tối đa 10 lần đoán
                soLanDoan++;
                System.out.print("Lần " + soLanDoan + ", mời nhập số: ");
                int doan = sc.nextInt();

                if (doan == soMayChon) {
                    System.out.println("Đúng rồi! Điểm của bạn: " + (11 - soLanDoan));
                    thang = true;
                    break; 
                } else if (doan < soMayChon) {
                    System.out.println("Số của máy LỚN HƠN.");
                } else {
                    System.out.println("Số của máy NHỎ HƠN.");
                }
            }

            if (!thang) System.out.println("Thua rồi! Số đúng là: " + soMayChon);

            System.out.print("Chơi lại không? (c/k): ");
            choiLai = sc.next();

        } while (choiLai.equals("c")); 

        System.out.println("Tạm biệt!");
    }
}
