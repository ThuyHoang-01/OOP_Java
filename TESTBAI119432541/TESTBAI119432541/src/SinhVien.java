import java.util.Date;

public class SinhVien implements Comparable<SinhVien> {
	private String Masv;
	private String Tensv;
	private Date Namsinh;
	private String Diachi;
	private String Lop;

	public String getMasv() {
		return Masv;
	}

	public void setMasv(String masv) {
		Masv = masv;
	}

	public String getTensv() {
		return Tensv;
	}

	public void setTensv(String tensv) {
		Tensv = tensv;
	}

	public Date getNamsinh() {
		return Namsinh;
	}

	public void setNamsinh(Date namsinh) {
		Namsinh = namsinh;
	}

	public String getDiachi() {
		return Diachi;
	}

	public void setDiachi(String diachi) {
		Diachi = diachi;
	}

	public String getLop() {
		return Lop;
	}

	public void setLop(String lop) {
		Lop = lop;
	}

	@Override
	public String toString() {
		return "SinhVien [Masv=" + Masv + ", Tensv=" + Tensv + ", Namsinh=" + Namsinh + ", Diachi=" + Diachi + ", Lop="
				+ Lop + "]";
	}

	public SinhVien() {
	}

	public SinhVien(String masv, String tensv, Date namsinh, String diachi, String lop) {
		Masv = masv;
		Tensv = tensv;
		Namsinh = namsinh;
		Diachi = diachi;
		Lop = lop;
	}

	@Override
	public int compareTo(SinhVien o) {
		return this.Masv.compareTo(o.Masv);
	}

}
