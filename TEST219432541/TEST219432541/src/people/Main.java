package people;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<NhanVien> employeeList = new ArrayList<>();

		NhanVien gv1 = new GiangVien("GV_01", "Nguyen Van A", "23/06/1996", 301, 10);
		NhanVien gv2 = new GiangVien("GV_02", "Nguyen Van B", "24/05/1998", 250, 9);
		NhanVien ncv1 = new NghienCuuVien("NCV_01", "Hoang Thi C", "22/11/2001", 2, 4);
		NhanVien ncv2 = new NghienCuuVien("NCV_02", "Hoang Thi D", "22/10/2000", 1, 1);
		NhanVien nvvp1 = new NhanVienVanPhong("NVVP_01", "Do Hoang E", "23/05/1996", 4, 25);
		NhanVien nvvp2 = new NhanVienVanPhong("NVVP_02", "Do Hoang F", "23/11/2001", 0, 15);

		employeeList.add(gv1);
		employeeList.add(gv2);
		employeeList.add(ncv1);
		employeeList.add(ncv2);
		employeeList.add(nvvp1);
		employeeList.add(nvvp2);

		QLNV a = new QLNV();
		int luaChon = 0;

		do {
			System.out.println("MENU ---------- ");
			System.out.println("Vui lòng chọn chức năng: ");
			System.out.println("1. Thêm Giao Vien vào danh sách.\n" + "2. Thêm Nghien Cuu Vien vào danh sách .\n"
					+ "3. Thêm Nhan Vien Van Phong vào danh sách .\n"
					+ "4. Xuất ra các nhân viên tiêu chuẩn lao động tiên tiến.\n" + "0.   Thoát khỏi chương trình");
			luaChon = sc.nextInt();
			sc.nextLine();

			if (luaChon == 1) {
				System.out.println("Nhập mã nhân viên: ");
				String maNV = sc.nextLine();
				System.out.println("Nhập họ và tên: ");
				String hoTen = sc.nextLine();
				System.out.println("Nhập năm sinh: ");
				String namSinh = sc.nextLine();
				System.out.println("So tiet: ");
				int soTiet = sc.nextInt();
				System.out.println("So de tai khoa luan: ");
				int soDeTaiKhoaLuan = sc.nextInt();

				NhanVien gv = new GiangVien(maNV, hoTen, namSinh, soTiet, soDeTaiKhoaLuan);
				employeeList.add(gv);
				a.Nhap(employeeList); // Cho phép nhập vào danh sách các nhân viên
			} else if (luaChon == 2) {
				System.out.println("Nhập mã nhân viên: ");
				String maNV = sc.nextLine();
				System.out.println("Nhập họ và tên: ");
				String hoTen = sc.nextLine();
				System.out.println("Nhập năm sinh: ");
				String namSinh = sc.nextLine();
				System.out.println("So de tai: ");
				int soDeTaiNghienCuu = sc.nextInt();
				System.out.println("So bai bao: ");
				int soBaiBaoKhoaHoc = sc.nextInt();

				NhanVien ncv = new NghienCuuVien(maNV, hoTen, namSinh, soDeTaiNghienCuu, soBaiBaoKhoaHoc);
				employeeList.add(ncv);
				a.Nhap(employeeList); // Cho phép nhập vào danh sách các nhân viên
			} else if (luaChon == 3) {
				System.out.println("Nhập mã nhân viên: ");
				String maNV = sc.nextLine();
				System.out.println("Nhập họ và tên: ");
				String hoTen = sc.nextLine();
				System.out.println("Nhập năm sinh: ");
				String namSinh = sc.nextLine();
				System.out.println("So lop boi duong: ");
				int soLopBoiDuongThamGia = sc.nextInt();
				System.out.println("So gio lao dong: ");
				int soGioLaoDongCongIch = sc.nextInt();

				NhanVien nvvp = new NhanVienVanPhong(maNV, hoTen, namSinh, soLopBoiDuongThamGia, soGioLaoDongCongIch);
				employeeList.add(nvvp);
				a.Nhap(employeeList); // Cho phép nhập vào danh sách các nhân viên
			} else if (luaChon == 4) {
				a.Xuat(); // Xuất ra các nhân viên tiêu chuẩn lao động tiên tiến
			}
		} while (luaChon != 0);
	}
}