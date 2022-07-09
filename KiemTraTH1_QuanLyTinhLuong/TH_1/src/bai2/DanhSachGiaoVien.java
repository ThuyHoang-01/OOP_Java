package bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachGiaoVien {
	private ArrayList<CBGV> danhSach;

	public DanhSachGiaoVien() {
		this.danhSach = new ArrayList<CBGV>();
	}

	public DanhSachGiaoVien(ArrayList<CBGV> danhSach) {
		this.danhSach = danhSach;
	}

	// 1. Thêm CBGV vào danh sách.
	public void themCBGV(CBGV cbgv) {
		this.danhSach.add(cbgv);
	}

	// 2. In danh CBGV viên ra màn hình.
	public void inDanhSachCBGV() {
		for (CBGV cbgv : danhSach) {
			System.out.println(cbgv);
		}
	}

	// 3. Kiểm tra danh sách có rỗng hay không.
	public boolean kiemTraDanhSachRong() {
		return this.danhSach.isEmpty();
	}

	// 4. Lấy ra số lượng CBGV trong danh sách.
	public int laySoLuongCBGV() {
		return this.danhSach.size();
	}

	// 5. Làm rỗng danh sách CBGV
	public void lamRongDanhSach() {
		this.danhSach.removeAll(danhSach);
	}

	// 6. Kiểm tra CBGV có tồn tại trong danh sách hay không, dựa trên MSGV
	public boolean kiemTraTonTai(CBGV cbgv) {
		return this.danhSach.contains(cbgv);
	}

	// 7. Xóa một CBGV ra kh?i danh sách dựa trên mã CBGV.
	public boolean xoaGiaoVien(CBGV cbgv) {
		return this.danhSach.remove(cbgv);
	}

	// 8. Tinh Luong Thuc linh CBGV
	public void tinhLuongThucLinh(String msgv) {
		Scanner sc = new Scanner(System.in);
		for (CBGV cbgv : danhSach) {
			if (cbgv.getMSGV().indexOf(msgv) >= 0) {
				System.out.println("Nhap Luong cung: ");
				Double luongCung = sc.nextDouble();
				System.out.println("Nhap Luong thuong: ");
				Double luongThuong = sc.nextDouble();
				System.out.println("Nhap Luong phat: ");
				Double luongPhat = sc.nextDouble();

				System.out.println("Luong Thuc Linh cua giao vien: " + cbgv.luongThucLinh(luongCung, luongThuong, luongPhat));
			} else {
				System.out.println("Ma so GV khong ton tai");
			}
		}
	}
}
