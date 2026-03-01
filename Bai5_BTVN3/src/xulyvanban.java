import java.util.*;
import java.util.function.Function;
import java.util.stream.*;
public class xulyvanban {
	public static void main(String[] args) {
        String text = "Java is fun. Java is powerful. Learning Java is great!"; // Ví dụ văn bản
        
        // 1. Đếm số từ và số câu
        String[] words = text.split("\\s+");
        long countWords = Arrays.stream(words).parallel().count();
        long countSentences = text.split("[.!?]").length;

        // 2. Tìm từ xuất hiện nhiều nhất
        String mostFreq = Arrays.stream(words)
                .parallel()
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey).orElse("");

        // 3. Đảo ngược văn bản
        String reversed = new StringBuilder(text).reverse().toString();

        System.out.println("Số từ: " + countWords + " | Số câu: " + countSentences);
        System.out.println("Từ xuất hiện nhiều nhất: " + mostFreq);
        System.out.println("Văn bản đảo ngược: " + reversed);
    }
}
