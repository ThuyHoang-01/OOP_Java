import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
	private ArrayList<SinhVien> dsSv = new ArrayList<SinhVien>();

	public DanhSachSinhVien() {
		this.dsSv = new ArrayList<SinhVien>();
	}

	public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
		this.dsSv = danhSach;
	}

	public boolean ktTrungma(String masv) {
		for (SinhVien sv : dsSv) {
			if (sv.getMasv().equalsIgnoreCase(masv))
				return true;
		}
		return false;
	}

	public boolean addSinhvien(SinhVien sv) {
		if (ktTrungma(sv.getMasv()))
			return false;
		return dsSv.add(sv);
	}

	public SinhVien findSinhvien1(String masv) {
		for (SinhVien sv : dsSv) {
			if (sv.getMasv().equalsIgnoreCase(masv))
				return sv;
		}
		return null;
	}

	public int findSinhvien2(String masv) {
		for (int i = 0; i < dsSv.size(); i++) {
			if (dsSv.get(i).getMasv().equalsIgnoreCase(masv))
				return i;
		}
		return -1;
	}
	public SinhVien updateSinhvien(int index, SinhVien sv) {
		return dsSv.set(index, sv);
	}

	public void removeSinhvien(String masv) {
		SinhVien sv = findSinhvien1(masv);
		dsSv.remove(sv);
		// int pos=findSinhvien2(masv);
		// dsSv.remove(pos);
	}
	// Xuat ra dssv theo MaSV giam dan
	public void sapXepSinhVienGiamDanTheoMaSV() {
		Collections.sort(this.dsSv, new Comparator<SinhVien>() {
			@Override
			public int compare(SinhVien sv1, SinhVien sv2) {
				if (sv1.getMasv().compareTo(sv2.getMasv()) < 0) {
					return 1;
				} else if (sv1.getMasv().compareTo(sv2.getMasv()) > 0) {
					return -1;
				} else {
					return 0;
				}
			}
		});
	}

	public void inDanhSachSinhVien() {
		for (SinhVien sinhVien : dsSv) {
			System.out.println(sinhVien);
		}
	}
}
