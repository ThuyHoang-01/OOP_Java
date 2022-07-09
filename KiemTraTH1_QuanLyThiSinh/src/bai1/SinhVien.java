package bai1;

public class SinhVien {

	protected String hoTen;
	protected String mssv;
	protected String diachi;
	protected String mucuutien;
	
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getMssv() {
		return mssv;
	}

	public void setMssv(String mssv) {
		this.mssv = mssv;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getMucuutien() {
		return mucuutien;
	}

	public void setMucuutien(String mucuutien) {
		this.mucuutien = mucuutien;
	}

	public SinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SinhVien(String hoTen, String mssv, String diachi, String mucuutien) {
		super();
		this.hoTen = hoTen;
		this.mssv = mssv;
		this.diachi = diachi;
		this.mucuutien = mucuutien;
	}
	
	@Override
	public String toString() {
		return "SinhVien [hoTen=" + hoTen + ", mssv=" + mssv + ", diachi=" + diachi + ", mucuutien=" + mucuutien + "]";
	}

	
}
