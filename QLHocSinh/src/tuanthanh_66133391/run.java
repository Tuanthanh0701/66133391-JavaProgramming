package tuanthanh_66133391;
import java.util.ArrayList;
import java.util.Scanner;

public class run {

	public static void main(String[] args) {
		// Tao moi 2 hoc sinh 
		
		HocSinh hs1 = new HocSinh(); 
		
		String tenHS1 = "Tran Van A";
		hs1.setTenHS(tenHS1); 
		
		short tuoiHS1 = 10;
		hs1.setTuoiHS(tuoiHS1);
		
		String lopHS1 = "8A-12";
		hs1.setLopHS(lopHS1);
		
		HocSinh hs2 = new HocSinh("Tran Thi Tuoi", (short)12, "6C");
		// In ra man hinh 
		System.out.print(hs1.toString());
		
		System.out.println("\nTen cua hoc sinh 2 la: " + hs2.getTenHS() );
		System.out.println("Tuoi cua hoc sinh 2 la: " + hs2.getTuoiHS() );
		System.out.println("Lop cua hoc sinh 2 la: " + hs2.getLopHS() );

		// Nhap du lieu tu ban phim
		Scanner banPhim = new Scanner(System.in);
		// Nhap du lieu cho hoc sinh thu 3
		HocSinh hs3 = new HocSinh();
		// Hoi user nhap vao ten 
		System.out.print("Moi nhap ten cua hoc sinh thu 3: ");
		String tenHS3= banPhim.nextLine();
		// Goi vao bien hs3
		hs3.setTenHS(tenHS3);
		
		System.out.print("Moi nhap tuoi cua hoc sinh thu 3: ");
		short tuoiHS3= banPhim.nextShort();
		// Goi vao bien hs3
		hs3.setTuoiHS(tuoiHS3);
		
		System.out.print("Moi nhap lop cua hoc sinh thu 3: ");
		String lopHS3= banPhim.nextLine();
		// Goi vao bien hs3
		hs3.setLopHS(lopHS3);
		
		// In ra man hinh 
		System.out.print(hs3.toString());
		
		// Nhap danh sach n hojc sinh 
		ArrayList<HocSinh> dsHocSinh = new ArrayList<HocSinh>();
		// Nhap n
		int N =3;
		
		for(int i=0; i<N; i++) {
			HocSinh hsi = new HocSinh();
			System.out.print("Moi nhap ten cua hoc sinh thu : " +i);
			String tenHSi= banPhim.nextLine();
			hsi.setTenHS(tenHSi);
			
			System.out.print("Moi nhap tuoi cua hoc sinh thu : " +i);
			short tuoiHSi= banPhim.nextShort();
			hsi.setTuoiHS(tuoiHSi);
			
			System.out.print("Moi nhap lop cua hoc sinh thu : " +i);
			String lopHSi= banPhim.nextLine();
			hsi.setLopHS(lopHSi);
			
		// Dua vao danh sach
		dsHocSinh.add(hsi);
		}
		
		// In ra
		for(int i=0; i<N; i++) {
			System.out.println(dsHocSinh.get(i).toString());
		}
		
		// Bo sung them
		HocSinh hsThem = new HocSinh();
		// Nhap tu ban phim
		//...
		//
		
		// Them vao danh sach 
		dsHocSinh.add(hsThem);
		// In ra
		for(int i=0; i<N; i++) {
			System.out.println(dsHocSinh.get(i).toString());
		}

		// Xoa sinh vien
		// Tim hoc sinh ten Hoa dau tien trong danh sach
		for(int i=0; i<N; i++) {
			HocSinh hsTim= dsHocSinh.get(i);
			if(hsTim.getTenHS()=="Hoa") {
				dsHocSinh.remove(hsTim);
				break;
			}
		}
		
		// In ra
		for(int i=0; i<N; i++) {
			System.out.println(dsHocSinh.get(i).toString());
		}
	}
}
