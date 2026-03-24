
public class run {

	public static void main(String[] args) {
		//Lớp nhân viên
		NhanVien nv1 = new NhanVien("001", "Nguyễn Ngọc Luân", 250000);
		//nv1.hienThongTin
		System.out.println(nv1.toString());
		
		NhanVienVanPhong nvVanPhong1 = new NhanVienVanPhong(" 002", "Trần Thị Như Quy", 5000000, 10, 50000);
		System.out.println(nvVanPhong1.toString());
		
		nvVanPhong1.hienThiThongTin();
		
		
	}	

}