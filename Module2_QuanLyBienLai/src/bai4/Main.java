package bai4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	 public static void main(String[] args)
	   {
	       Scanner sc=new Scanner(System.in);
	       int n;
	       try
	       {
	           System.out.println("Ban muon nhap bao nhieu ho gia dinh : ");
	           n=sc.nextInt();
	       }catch(InputMismatchException e) 
	       {
	           n=0;
	       }
	       
	       ArrayList ds=new ArrayList(100);
	       for(int i=0;i < n;i++)
	       {
	           BienLai b=new BienLai();
	           b.nhapThongTin();
	           ds.add(b);
	       }
	       for(int i=0;i < n;i++)
	       {
	    	   System.out.println("===================");
	           System.out.println("Ho gia dinh thu : "+(i+1));
	           ((BienLai) ds.get(i)).hienThongTin();
	           System.out.println("====================");
	       }
	   }
}
