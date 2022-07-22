package people;

public abstract class NhanVien {
	//Mã nhân viên; Họ tên; Ngày tháng năm sinh.
	private String maNV;
	private String hoTen;
	private String ngaySinh;

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public NhanVien(String maNV, String hoTen, String ngaySinh) {
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
	}

	public abstract boolean xetLaoDongTienTien();

	@Override
	public String toString() {
		return "Nhan vien: [maNV: " + maNV + ", hoTen: " + hoTen + ", ngaySinh: " + ngaySinh + "]";
	}

}
