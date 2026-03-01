import java.util.*;
import java.util.stream.Collectors;
public class qldiemsinhvien {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập số lượng sinh viên: "); // Nhập số lượng n
        int n = sc.nextInt();
        List<Double> dsDiem = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập điểm sinh viên thứ " + (i + 1) + ": "); // Nhập điểm
            dsDiem.add(sc.nextDouble());
        }

        // 1. Hiển thị danh sách điểm
        System.out.println("\nDanh sách điểm: " + dsDiem);

        // 2. Sử dụng Stream API để tính toán
        double tb = dsDiem.stream().mapToDouble(d -> d).average().orElse(0.0);
        double max = dsDiem.stream().mapToDouble(d -> d).max().orElse(0.0);
        double min = dsDiem.stream().mapToDouble(d -> d).min().orElse(0.0);

        System.out.println("Điểm trung bình: " + tb);
        System.out.println("Điểm cao nhất: " + max);
        System.out.println("Điểm thấp nhất: " + min);

        // 3. Sắp xếp tăng dần bằng Stream
        List<Double> dsSapXep = dsDiem.stream().sorted().collect(Collectors.toList());
        System.out.println("Danh sách sau khi sắp xếp tăng dần: " + dsSapXep);
    }
}
