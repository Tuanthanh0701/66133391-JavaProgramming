package Thanh_66133391_NTU;

import java.util.ArrayList;
import java.util.Scanner;

public class runMain {

	public static void main(String[] args ) {
	// Khai bao bien danh sach 
	ArrayList<Integer> dsSoNguyen =  new ArrayList<Integer>();
	// a.Nhap 10 phan tu 
	Scanner banphim = new Scanner(System.in);
	
	for(int i=0; i<10; i++) {
		// NHap 1 phan tu
		System.out.print("Moi nhap phan tu thu" + i + ": " );
		// Cho user nhap, cat vao bien tam
		Integer tam = banphim .nextInt();
		// Them vao cuoi danh sach 
		dsSoNguyen.add(tam);
		
	// b.In ra danh sach vua nhap
	System.out.print("Danh sach vua nhap la \n");
//	for(int i=0; i<dsSoNguyen.size(); i++) {
//		// Lay gia tri phan tu o vi tri i, cat vao bien tam
//		Integer tam = dsSoNguyen.get(i);
//		System.out.print(tam + " ");
//		}
	for(Integer x: dsSoNguyen) {
		System.out.print(x + " ");
	}
	
	
		}		
	}
}
