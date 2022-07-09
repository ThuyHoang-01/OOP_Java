package bai4;
import java.util.Scanner;

public class KhachHang {

	private String hoTen;
    private int soNha;
    private String maCongTo;
   
    public KhachHang()
    {
    }
    public KhachHang(String hoTen,int soNha,String maCongTo)
    {
        this.hoTen=hoTen;
        this.soNha=soNha;
        this.maCongTo=maCongTo;
    }
    public void nhapThongTin()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ho ten khach hang:");
        this.hoTen=sc.nextLine();
        System.out.print("Nhap so nha :");
        this.soNha=sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ma cong to:");
        this.maCongTo=sc.nextLine();
    }
    public void hienThongTin()
    {
        System.out.println("Ho Ten: "+this.hoTen);
        System.out.println("So nha: "+this.soNha);
        System.out.println("Ma cong to: "+this.maCongTo);
    }
}
