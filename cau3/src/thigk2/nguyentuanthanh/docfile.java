package thigk2.nguyentuanthanh;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class docfile {
	// Tóm tắt cách giải:
    // 1. Dùng lớp File và Scanner để đọc file văn bản "songuyen.txt".
    // 2. Dùng vòng lặp while(sc.hasNextInt()) đọc từng dòng lưu vào ArrayList và in ra màn hình.
    // 3. Khai báo biến x là số cuối mã sinh viên (X=1), dùng list.contains(x) để kiểm tra.
    public static void main(String[] args) {
        ArrayList<Integer> danhSachSo = new ArrayList<>();
        
        // Trỏ tới file songuyen.txt nằm ở thư mục gốc của project
        File file = new File("songuyen.txt");

        try {
            Scanner sc = new Scanner(file);
            System.out.println("--- DANH SÁCH SỐ NGUYÊN ĐỌC TỪ FILE ---");
            
            // Đọc lần lượt từng số cho đến khi hết file
            while (sc.hasNextInt()) {
                int so = sc.nextInt();
                danhSachSo.add(so);
                System.out.print(so + " "); // In số đó ra cùng 1 dòng cách nhau khoảng trắng
            }
            sc.close(); // Đóng luồng đọc file
            System.out.println("\n"); // Xuống dòng

            // Gán X = ký tự cuối của mã số sinh viên (Mã của bạn là 66133391 -> X = 1)
            int x = 1; 
            System.out.println("Giá trị X cần tìm (ký tự cuối mã SV 66133391): " + x);

            // Kiểm tra xem số 1 có trong danh sách vừa đọc không
            if (danhSachSo.contains(x)) {
                System.out.println("-> KẾT LUẬN: Giá trị X (" + x + ") CÓ tồn tại trong danh sách.");
            } else {
                System.out.println("-> KẾT LUẬN: Giá trị X (" + x + ") KHÔNG tồn tại trong danh sách.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("LỖI: Không tìm thấy file 'songuyen.txt'!");
            System.out.println("Hãy đảm bảo bạn đã tạo file này ở thư mục gốc của project (ngang hàng với thư mục src).");
        }
    }
}
