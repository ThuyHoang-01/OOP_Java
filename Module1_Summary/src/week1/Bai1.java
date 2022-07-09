package week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Bai1 {
	/*
	 * Viết chương trình Java mà khi chạy, màn hình console sẽ cho phép ta nhập vào
	 * một số nguyên, in ra màn hình “Đây là số nguyên dương” nếu số vừa nhập vào là
	 * một số lớn hơn hoặc bằng 0, ngược lại in ra “Đây là số nguyên âm”.
	 */

	public static void main(String[] args) {
		String number;
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhập vào số mà bạn muốn kiểm tra:");
		number = scan.nextLine();

		checkSoNguyen(number);
		scan.close();
	}

	public static void checkSoNguyen(String number) {
		if (isInteger(number)) {
			System.out.println(" Bạn đã nhập đúng dữ liệu ^_^");
			int iVal = Integer.parseInt(number);
			if (iVal >= 0) {
				System.out.println(" =>Đây là số nguyên dương");
			} else {
				System.out.println(" =>Đây là số nguyên âm ");
			}
		} else {
			System.out.println(" => Không xác định");
		}
	}

	public static boolean isInteger(String s) {
		System.out.println(String.format(" \"%s\"", s));
		if (s == null || s.equals("")) {
			System.out.println("Dữ liệu nhập không được để trống");
			return false;
		}
		try {
			int iVal = Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("Dữ liệu nhập không phải kiểu số ! Vui lòng nhập lại");
		}
		return false;
	}
}
