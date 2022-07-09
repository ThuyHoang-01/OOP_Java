package bai2;

public class CBGV extends Nguoi {
	private double LuongCung;
	private double LuongThuong;
	private double TienPhat;

	public CBGV(String hoTen, int tuoi, String queQuan, String mSGV) {
		super(hoTen, tuoi, queQuan, mSGV);
	}

	public CBGV(String mSGV) {
		super(mSGV);
	}

	public double luongThucLinh(double LuongCung, double LuongThuong, double LuongPhat) {
		return (LuongCung + LuongThuong) - LuongPhat;
	}
}
