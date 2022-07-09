package bai5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		QuanLy ql = new QuanLy();

		ql.nhapDanhSach(sc);

		System.out.println("Danh sach sinh vien tra sach vao cuoi thang:");
		ql.hienThiDanhSachTraCuoiThang();

		sc.close();
	}
}
