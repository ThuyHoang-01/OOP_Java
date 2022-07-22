package people;

public class NhanVienVanPhong extends NhanVien {
	//- Nhân viên văn phòng có thông tin ghi nhận số lượng lớp bồi dưỡng chuyên môn mà nhân viên văn phòng đã tham gia trong năm;
	//số giờ tham gia lao động công ích do trường tổ chức.
	private int soLopBoiDuongThamGia;
	private int soGioLaoDongCongIch;

	public int getSoLopBoiDuongThamGia() {
		return soLopBoiDuongThamGia;
	}

	public void setSoLopBoiDuongThamGia(int soLopBoiDuongThamGia) {
		this.soLopBoiDuongThamGia = soLopBoiDuongThamGia;
	}

	public int getSoGioLaoDongCongIch() {
		return soGioLaoDongCongIch;
	}

	public void setSoGioLaoDongCongIch(int soGioLaoDongCongIch) {
		this.soGioLaoDongCongIch = soGioLaoDongCongIch;
	}

	public NhanVienVanPhong(String maNV, String hoTen, String ngaySinh, int soLopBoiDuongThamGia,
			int soGioLaoDongCongIch) {
		super(maNV, hoTen, ngaySinh);
		this.soLopBoiDuongThamGia = soLopBoiDuongThamGia;
		this.soGioLaoDongCongIch = soGioLaoDongCongIch;
	}

	@Override
	public boolean xetLaoDongTienTien() {
		if (this.getSoLopBoiDuongThamGia() >= 1 && this.getSoGioLaoDongCongIch() >= 20)
			return true;
		else
			return false;
	}

}
