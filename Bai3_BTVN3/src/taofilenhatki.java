import java.io.*;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class taofilenhatki {
	private static final String FILE_NAME = "nhatky.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int luaChon;

        do {
            System.out.println("\n===== NHẬT KÝ CÁ NHÂN =====");
            System.out.println("1. Viết nhật ký mới");
            System.out.println("2. Xem lại nhật ký");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            luaChon = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng trống

            switch (luaChon) {
                case 1:
                    vietNhatKy(scanner);
                    break;
                case 2:
                    docNhatKy();
                    break;
                case 0:
                    System.out.println("Tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (luaChon != 0);

        scanner.close();
    }

    // Hàm ghi nội dung vào file
    // Ghi nhật ký
    public static void vietNhatKy(Scanner scanner) {
        try (FileWriter fw = new FileWriter(FILE_NAME, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {

            // Lấy thời gian hiện tại
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            String thoiGian = now.format(formatter);

            System.out.println("Nhập nội dung nhật ký (Nhấn Enter để lưu):");
            String noiDung = scanner.nextLine();

            // Ghi vào file: [Thời gian] Nội dung
            out.println("[" + thoiGian + "] " + noiDung);
            System.out.println("Đã lưu vào nhật ký!");

        } catch (IOException e) {
            System.err.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }

    // Hàm đọc nội dung từ file
     // Đọc nhật ký
    public static void docNhatKy() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            System.out.println("Nhật ký trống (File chưa tồn tại).");
            return;
        }

        System.out.println("\n--- NỘI DUNG NHẬT KÝ ---");
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc file: " + e.getMessage());
        }
        System.out.println("------------------------");
    }
}
