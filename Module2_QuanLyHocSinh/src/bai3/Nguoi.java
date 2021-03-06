package bai3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {

	private String hoten;
	private Date ngaysinh;
	private String quequan;

	public Nguoi() {
		super();
	}

	public Nguoi(String hoten, Date ngaysinh, String quequan) {
		super();
		this.hoten = hoten;
		this.ngaysinh = ngaysinh;
		this.quequan = quequan;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public Date getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public String getQuequan() {
		return quequan;
	}

	public void setQuequan(String quequan) {
		this.quequan = quequan;
	}

	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ho ten: ");
		this.hoten = sc.nextLine();
		System.out.print("Nhap ngay sinh (dd-mm-yyyy): ");
		String ns = sc.nextLine();
		this.ngaysinh = chuyenStringDate(ns);
		System.out.print("Nhap que quan: ");
		this.quequan = sc.nextLine();
	}

	public void hienThongTin() {
		System.out.println("Ho va ten: " + this.hoten);
		System.out.println("Ngay Sinh: " + this.ngaysinh);
		System.out.println("Que quan: " + this.quequan);
	}

	public Date chuyenStringDate(String str) {
		Date ns = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		try {
			ns = sdf.parse(str);
		} catch (Exception e) {
			System.out.println("Loi dinh dang ngay thang.!");
		}
		return ns;
	}


}
