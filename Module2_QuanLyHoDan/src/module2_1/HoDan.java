package module2_1;

import java.util.Scanner;

public class HoDan {
	private int soTVien;
	private int soNha;
	private Nguoi[] thanhVien;
	private int n;

	public HoDan() {
		this.thanhVien = new Nguoi[10];
	}

	public HoDan(int soTVien, int soNha, Nguoi[] thanhVien) {
		this.soTVien = soTVien;
		this.soNha = soNha;
		this.thanhVien = thanhVien;
	}

public void nhapThongTin(Scanner sc)
	{
	System.out.print("Nhap so thanh vien: ");
	this.soTVien=sc.nextInt();
	System.out.print("Nhap so nha: ");
	this.soNha=sc.nextInt();sc.nextLine();
	for(int i=0;i<=n;i++)
	{
	System.out.println("Nhap thong tin thanh vien thu "+(i+1)+": ");
	thanhVien[i]=new Nguoi();
	thanhVien[i].nhapThongTin(sc);
	}
	}

public void hienThongTin()
	{
	System.out.println("So nha: "+this.soNha);
	System.out.println("So thanh vien: "+this.soTVien);
	for(int i=0;i<=n;i++)
	{
	System.out.println("Thanh vien thu "+(i+1)+": ");
	thanhVien[i].hienThongTin();
	}
	}

public Nguoi[] getThanhVien()
	{
	return this.thanhVien;
	}
}


