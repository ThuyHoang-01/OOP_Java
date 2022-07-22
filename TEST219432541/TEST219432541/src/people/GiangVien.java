package people;

public class GiangVien extends NhanVien {
	//- Giảng viên có thông tin về số tiết giảng dạy trong năm; số đề tài khóa luận mà giảng viên đó hướng dẫn
	private int soTiet;
	private int soDeTaiKhoaLuan;

	public int getSoTiet() {
		return soTiet;
	}

	public void setSoTiet(int soTiet) {
		this.soTiet = soTiet;
	}

	public int getSoDeTaiKhoaLuan() {
		return soDeTaiKhoaLuan;
	}

	public void setSoDeTaiKhoaLuan(int soDeTaiKhoaLuan) {
		this.soDeTaiKhoaLuan = soDeTaiKhoaLuan;
	}

	public GiangVien(String maNV, String hoTen, String ngaySinh, int soTiet, int soDeTaiKhoaLuan) {
		super(maNV, hoTen, ngaySinh);
		this.soTiet = soTiet;
		this.soDeTaiKhoaLuan = soDeTaiKhoaLuan;
	}

	@Override
	public boolean xetLaoDongTienTien() {
		if (this.getSoTiet() >= 300 && this.getSoDeTaiKhoaLuan() >= 5)
			return true;
		else
			return false;
	}
}
