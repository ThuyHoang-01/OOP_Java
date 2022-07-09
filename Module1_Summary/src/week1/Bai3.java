package week1;

import java.util.Scanner;

public class Bai3 {
/*Viết chương trình cho phép nhập vào một số nguyên n ( n < 1000 ). In ra tất cả số nguyên 
tố trong khoảng từ 0 - n.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
	      boolean soNguyenTo = false;
	     System.out.println(" Nhập vào số nguyên");
	      Scanner sc = new Scanner(System.in);
	      n = sc.nextInt();
	      System.out.println("Số nguyên tố gồm 1,2");
	      for (int i = 3; i <= n; i++) 
	      {  
	         
	         soNguyenTo = true; 
	         for (int j = 2; j < i; j++)
	         {
	            if (i % j == 0)
	               soNguyenTo = false;
	         }
	         if (soNguyenTo == true)
	        	 System.out.println("Số nguyên tố gồm " +i);
	          
	      }
	   }
	
	
}
