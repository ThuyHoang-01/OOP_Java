package bai3;

import java.util.Date;
import java.util.Scanner;

public class HSHocSinh  {

	private String lop;
	private String khoahoc;
	private Nguoi nguoi;
	
	
	public HSHocSinh() {
		super();
	}


	public HSHocSinh(String lop, String khoahoc, Nguoi nguoi) {
		super();
		this.lop = lop;
		this.khoahoc = khoahoc;
		this.nguoi = nguoi;
	}


	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public String getKhoahoc() {
		return khoahoc;
	}

	public void setKhoahoc(String khoahoc) {
		this.khoahoc = khoahoc;
	}
	
	public Nguoi getNguoi() {
		return nguoi;
	}


	public void setNguoi(Nguoi nguoi) {
		this.nguoi = nguoi;
	}


	public void nhapThongTin() {
        nguoi = new Nguoi();
        nguoi.nhapThongTin();
         
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập lớp: ");
        lop = scanner.nextLine();
    }
     
    public void hienThongTin() {
        nguoi.hienThongTin();
        System.out.println("Lớp: " + lop);
    }
 
}
