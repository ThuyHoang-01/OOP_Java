package bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception
	   { ArrayList<HSHocSinh> arrHS = new ArrayList<>();
       int n;
       HSHocSinh hoSoHocSinh;
       Scanner scanner = new Scanner(System.in);
        
       System.out.println("Nhập số học sinh: ");
       n = scanner.nextInt();
        
       for (int i = 0; i < n; i++) {
           System.out.println("Nhập thông tin học sinh thứ " + (i + 1) + ": ");
           hoSoHocSinh = new HSHocSinh();
           hoSoHocSinh.nhapThongTin();
           arrHS.add(hoSoHocSinh);
       }
        
       for (int i = 0; i < arrHS.size(); i++) {
           System.out.println("\nThông tin học sinh thứ " + (i+1) + ": ");
           arrHS.get(i).hienThongTin();
       }
        
       System.out.println("\nNhững Học Sinh có quê ở Thái Nguyên là: ");
       for (int i = 0; i < arrHS.size(); i++) {
           if (arrHS.get(i).getNguoi().getQuequan().equalsIgnoreCase("Thái Nguyên")) {
               arrHS.get(i).hienThongTin();
           }
       }
        
       System.out.println("\nNhững học sinh học lớp 10A1 là: ");
       for (int i = 0; i < arrHS.size(); i++) {
           if (arrHS.get(i).getLop().equalsIgnoreCase("10A1")) {
               arrHS.get(i).hienThongTin();
           }
       }
   }

}
