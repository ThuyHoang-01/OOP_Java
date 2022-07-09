package week1;

import java.util.Scanner;

public class GiaiPhuongTrinhBac1 {
//ax+b=0
//nếu a==0 và b==0 pt vô số n	
// nếu a==0 và b!=0 thì pt vô n
// a!=0 thì pt có 1 n0 x=-b/a

	
	public static void main(String[] args) {
		double a , b;
		Scanner s = new Scanner(System.in);
		System.out.println(" Nhập a :");
		a = s.nextDouble();
		System.out.println(" Nhập b :");
		b = s.nextDouble();
		
		GiaiPTBac1(a,b);
	}
	
	public static void GiaiPTBac1(double a , double b) {
		if (a==0) {
			if(b==0) {
				System.out.println(" Phương trình có vô số nghiệm");
			}
			else
				System.out.println("Phương trình vô nghiệm");
		}
		else
			System.out.println(" Phương trình có một nghiệm : x=" + (-b/a));
		
	}
}
