import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSinhVien {

	public static void main(String[] args) throws ParseException {
		DanhSachSinhVien qlsv = new DanhSachSinhVien();

		SinhVien teo = new SinhVien();
		teo.setMasv("113");
		teo.setTensv("Nguyen Van Teo");
		String ngaySinh1 = "23/05/1996";
		Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh1);
		teo.setNamsinh(date1);
		teo.setDiachi("Ho Chi Minh");
		teo.setLop("CNTT");
		qlsv.addSinhvien(teo);

		SinhVien ty = new SinhVien();
		ty.setMasv("114");
		ty.setTensv("Nguyen Van Ti");
		String ngaySinh2 = "22/11/2001";
		Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh2);
		ty.setNamsinh(date2);
		ty.setDiachi("Phu Yen");
		ty.setLop("KTPM");
		qlsv.addSinhvien(ty);

		qlsv.inDanhSachSinhVien();

		qlsv.sapXepSinhVienGiamDanTheoMaSV();
		System.out.println("\nDanh sach sinh vien sau khi da sap xep theo thu tu giam dan MaSV:");
		qlsv.inDanhSachSinhVien();
	}

}
