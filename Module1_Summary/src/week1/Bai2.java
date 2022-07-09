package week1;

import java.util.Scanner;

public class Bai2 {

/*Viết chương trình cho phép nhập vào 3 số thực. Chương trình này sẽ kiểm tra 3 số này có 
phải là 3 cạnh của một tam giác hay không.*/
	public static void main(String[] args) {
		double a , b ,c;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Mời bạn nhập a :");
		a = sc.nextDouble();
		System.out.println(" Mời bạn nhập b :");
		b = sc.nextDouble();
		System.out.println(" Mời bạn nhập c :");
		c = sc.nextDouble();
		
		truyenvao(a, b, c);
		
	}
	public static void truyenvao(double a , double b , double c) {
		if(a*a+b*b==c*c || b*b+c*c==a*a || c*c+a*a==b*b) {
			 System.out.println(" Ba số là cạnh của tam giác vuông");
		}  
	      else
	         System.out.println(" Ba số trên không phải là cạnh của tam giác");
		
	}
}
