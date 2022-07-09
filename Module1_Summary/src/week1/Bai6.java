package week1;

import java.util.Scanner;

public class Bai6 {
/*Viết chương trình cho phép nhập vào n, sau đó nhập vào n phần tử số nguyên. Cuối cùng, 
chương trình sẽ xuất ra giá trị trung bình của mảng này.*/
	public static void main(String[] args) {
	
		int n;
	      int[] soNguyen;
	      float ketQua = 0;
	      Scanner sc = new Scanner(System.in);

	      System.out.println("Nhập vào n:");
	      n = sc.nextInt();
	      soNguyen = new int[n];
	      for (int i = 0; i < n; i++)
	      {
	         System.out.println("Nhập vào số nguyên:");
	         soNguyen[i] = sc.nextInt();
	      }

	      for (int i = 0; i < n; i++)
	         ketQua += soNguyen[i];
	         ketQua = ketQua/n;

	      System.out.println("Trung bình cộng của các số nguyên là: " + ketQua);
	   }
	
	
   
}
