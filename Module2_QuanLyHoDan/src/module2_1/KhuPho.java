package module2_1;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class KhuPho {
	private HoDan[] dsHoDan;
	private int n;

	public void nhapHoDan(Scanner sc) {
		System.out.print("Nhap so ho dan can nhap: ");
		this.n = sc.nextInt();
		sc.nextLine();
		this.dsHoDan = new HoDan[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin dan thu " + (i + 1) + ": ");
			this.dsHoDan[i] = new HoDan();
			this.dsHoDan[i].nhapThongTin(sc);
		}
	}

	public static void main(String[] args) {
		KhuPho ql = new KhuPho();
		Scanner sc = new Scanner(System.in);
		ql.nhapHoDan(sc);
		System.out.println("Nhap nam mung tho: ");
		int nam = sc.nextInt();
		ql.mungTho(nam);
	}

	public void mungTho(int nam) {

		Nguoi thanhVien[] = null;
		boolean a = false;
		int soTvien;
		int b;
		for (int i = 0; i < n; i++) {
			b = 0;
			thanhVien = dsHoDan[i].getThanhVien();
			soTvien = thanhVien.length;
			while (soTvien != 0) {
				if ((nam - thanhVien[b].getNgaySinh().getYear() - 1900) >= 80) {
					a = true;
					break;
				}
				soTvien--;
				b++;
			}
			if (a == true)
				dsHoDan[i].hienThongTin();
		}
	}
}
