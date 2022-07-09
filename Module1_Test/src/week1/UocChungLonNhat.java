package week1;

import java.util.Scanner;

public class UocChungLonNhat {

 public static void main(String[] args) {
	int a , b ;
	Scanner sr = new Scanner(System.in);
		System.out.println(" Mời bạn nhập vào số thứ nhất :");
		a = sr.nextInt();
		System.out.println(" Mời bạn nhập vào số thứ hai :");
		b = sr.nextInt();
		
		UCLN(a, b);
		int ucln = UCLN(a, b);
		System.out.println(" Uớc chung lớn nhất là của " + a + " và " + b + " là " + ucln);
 }
	
 public static int UCLN (int a , int b) {
	 while(a!=b) {
		if(a>b)
	 {
		a = a-b;
	 }
	 else
		 b = b-a;
	  
	 }
	 return (a);
	 
 }
	 
 
 
}
