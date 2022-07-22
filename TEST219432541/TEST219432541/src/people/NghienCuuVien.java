package people;

public class NghienCuuVien extends NhanVien {
	//- Nghiên cứu viên có thông tin về số đề tài nghiên cứu mà nghiên cứu viên đó tham gia và số bài báo khoa học mà nghiên cứu viên đó là tác giả (hoặc đồng tác giả).
	private int soDeTaiNghienCuu;
	private int soBaiBaoKhoaHoc;

	public int getSoDeTaiNghienCuu() {
		return soDeTaiNghienCuu;
	}

	public void setSoDeTaiNghienCuu(int soDeTaiNghienCuu) {
		this.soDeTaiNghienCuu = soDeTaiNghienCuu;
	}

	public int getSoBaiBaoKhoaHoc() {
		return soBaiBaoKhoaHoc;
	}

	public void setSoBaiBaoKhoaHoc(int soBaiBaoKhoaHoc) {
		this.soBaiBaoKhoaHoc = soBaiBaoKhoaHoc;
	}

	public NghienCuuVien(String maNV, String hoTen, String ngaySinh, int soDeTaiNghienCuu, int soBaiBaoKhoaHoc) {
		super(maNV, hoTen, ngaySinh);
		this.soDeTaiNghienCuu = soDeTaiNghienCuu;
		this.soBaiBaoKhoaHoc = soBaiBaoKhoaHoc;
	}

	@Override
	public boolean xetLaoDongTienTien() {
		if (this.getSoDeTaiNghienCuu() >= 1 && this.getSoBaiBaoKhoaHoc() >= 2)
			return true;
		else
			return false;
	}

}
