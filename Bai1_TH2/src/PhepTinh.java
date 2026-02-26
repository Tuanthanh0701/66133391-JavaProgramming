public class PhepTinh {
    public static void main(String[] args) {
     
        double a = 10.5;
        double b = 5.0;
     
        double tong = a + b;
        double hieu = a - b;
        double tich = a * b;
        double thuong = a / b;
    
        System.out.println("--- Kết quả các phép tính giữa " + a + " và " + b + " ---");
        System.out.println("Tổng (a + b)  = " + tong);
        System.out.println("Hiệu (a - b)  = " + hieu);
        System.out.println("Tích (a * b)  = " + tich);
        System.out.println("Thương (a / b) = " + thuong);
    }
}