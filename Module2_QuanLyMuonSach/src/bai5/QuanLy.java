package bai5;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {

	private ArrayList<TheMuon> ds;


	public QuanLy() {
		ds = new ArrayList<TheMuon>(10);
	}

	
	public void themTheMuon(TheMuon theMuon) {
		ds.add(theMuon);
	}


	public void nhapDanhSach(Scanner sc) {
		TheMuon theMuon;

		System.out.print("Nhap vao so luong the muon: ");
		int n = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhap vao danh sach:");
		for (int i = 0; i < n; i++) {
			System.out.println("The muon thu " + (i + 1) + " la:");
			theMuon = new TheMuon();
			theMuon.nhapThongTin(sc);
			themTheMuon(theMuon);
		}
	}


	public void hienThiDanhSachTraCuoiThang() {
		for (TheMuon the : ds) {
			if (the.getHanTra().getDate() == 31 || the.getHanTra().getDate() == 30) {
				the.hienThiThongTin();
			}
		}
	}
}
