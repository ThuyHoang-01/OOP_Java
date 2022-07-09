package module2_1;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Nguoi {
	private String hoTen;
	private Date ngaySinh;
	private String ngNghiep;
	 

	public Nguoi() {
		
	}

	public Nguoi(String hoTen, Date ngaySinh, String ngNghiep) {
		super();
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.ngNghiep = ngNghiep;
	}


	public void nhapThongTin(Scanner sc)
	{
		System.out.print("Nhap ho ten: ");
		this.hoTen=sc.nextLine();
		System.out.print("Nhap ngay sinh theo dinh dang dd-MM-yyyy: ");
		String ns=sc.nextLine();
		this.ngaySinh=chuyenStringDate(ns);
		System.out.print("Nhap nghe nghiep: ");
		this.ngNghiep=sc.nextLine();
	}
	public Date chuyenStringDate(String ngay)
	{
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Date ns=null;
		try
	{
			ns=(Date) sdf.parse(ngay);
	}catch(Exception e)
	{
		System.out.println("Loi dinh dang thoi gian.!");
	}
		return ns;
	}
	public void hienThongTin()
	{
		System.out.println("Ho va ten: "+this.hoTen);
		System.out.println("Ngay sinh: "+this.ngaySinh);
		System.out.println("Nghe nghiep: "+this.ngNghiep);
	}
	public Date getNgaySinh()
	{
		return this.ngaySinh;
	}

}
