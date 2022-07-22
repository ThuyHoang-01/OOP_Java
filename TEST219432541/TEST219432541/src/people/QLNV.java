package people;
import java.util.ArrayList;

public class QLNV {
	private ArrayList<NhanVien> employeeList;

	public QLNV() {
		this.employeeList = new ArrayList<NhanVien>();
	}

	public QLNV(ArrayList<NhanVien> employeeList) {
		this.employeeList = employeeList;
	}

	// 1. Thêm Employee vào danh sách.
	public void Nhap(ArrayList<NhanVien> employeeList) {
		this.employeeList = employeeList;
	}

	// 2. In ra danh sách nhân viên đủ tiêu chuẩn lao động tiên tiến
	public void Xuat() {
		System.out.println("Danh sach nhan vien lao dong tien tien: ");
		for (NhanVien employee : employeeList) {
			if (employee.xetLaoDongTienTien() == true)
				System.out.println(employee);
		}
	}

}
