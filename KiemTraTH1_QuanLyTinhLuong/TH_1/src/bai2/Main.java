package bai2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DanhSachGiaoVien dsgv = new DanhSachGiaoVien();
		int luaChon = 0;
		do {
			System.out.println("MENU ---------- ");
			System.out.println("Vui lòng chon chức năng: ");
			System.out.println("1. Thêm giao vien vào danh sách.\n"
					+ "2. Xóa một giao vien ra khoi danh sách dựa trên ma so giao vien.\n"
					+ "3. In danh sách giao vien ra màn hình.\n"
					+ "4. Tinh luong thuc linh cua giao vien dua tren ma so giao vien\n"
					+ "0. Thoát khoi chương trình");
			luaChon = sc.nextInt();
			sc.nextLine();

			if (luaChon == 1) {
				System.out.println("Nhập ho và tên: ");
				String hoTen = sc.nextLine();
				System.out.println("Nhập que quan: ");
				String queQuan = sc.nextLine();
				System.out.println("Nhap ma so giao vien: ");
				String masoGV = sc.nextLine();
				System.out.println("Nhập tuoi: ");
				int tuoi = sc.nextInt();

				CBGV gv = new CBGV(hoTen, tuoi, queQuan, masoGV);
				dsgv.themCBGV(gv);

			} else if (luaChon == 2) {
				System.out.println("Nhap ma so giao vien: ");
				String masoGV = sc.nextLine();
				CBGV gv = new CBGV(masoGV);
				System.out.println("Xóa sinh viên trong danh sách: " + dsgv.xoaGiaoVien(gv));

			} else if (luaChon == 3) {
				dsgv.inDanhSachCBGV();

			} else if (luaChon == 4) {
				System.out.println("Nhap ma so giao vien: ");
				String masoGV = sc.nextLine();

				dsgv.tinhLuongThucLinh(masoGV);
			}

		} while (luaChon != 0);
	}
}
