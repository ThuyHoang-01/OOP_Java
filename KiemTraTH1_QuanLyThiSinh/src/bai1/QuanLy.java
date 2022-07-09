package bai1;

import java.util.ArrayList;
import java.util.List;

public class QuanLy {
	List<SinhVien> sinhviens;
    public QuanLy() {
        this.sinhviens = new ArrayList<>();
    }

    public  void add( SinhVien sinhvien) {
        this.sinhviens.add(sinhvien);
    }

    public void showInfor() {
        this.sinhviens.forEach(sinhvien -> System.out.println(sinhvien.toString()));
    }

    public SinhVien searchById(String mssv) {
        return this.sinhviens.stream().filter(sinhvien -> sinhvien.getMssv().equals(mssv)).findFirst().orElse(null);
    }
}
