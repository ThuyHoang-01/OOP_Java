package week1;
// so nguyên tố chia hết cho 1 và chính nó
// n<2 ko la snt 
// 2->n-1 %0 thì ko là snt 
import java.lang.Math;
import java.util.Scanner;

public class KiemTraSoNguyenTo {
 
	

	public static void main(String[] args) {
		int n;
	Scanner sr = new Scanner(System.in);
	System.out.println(" Mời bạn nhập số :");
	n= sr.nextInt();
	if(kiemtra(n)==true) {
		System.out.println(" La so nguyen to");
	}else
		System.out.println(" Khong la so nguyen to");
		
	}
	public static boolean kiemtra( int n) {
		if(n<2) 
			return false;
		for(int i = 2;i<= n/2 ; i++) 
				if(n%i==0) 
					return false;
			return true;
			
	}


	
}
