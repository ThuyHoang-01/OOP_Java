package bai1;

import java.util.Scanner;

public class TuyenSinh {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLy quanly = new QuanLy();
        while (true) {
            System.out.println("Quản lý ứng dụnng");
            System.out.println("Enter 1: Thêm thí sinh");
            System.out.println("Enter 2: Hiển thị thông tin thí sinh và khối thí sinh ");
            System.out.println("Enter 3: Tiềm kiếm theo số báo danh ");
            System.out.println("Enter 4: Thoát chương trình:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Enter a: Nhập thí sinh khối A");
                    System.out.println("Enter b: Nhập thí sinh khối B");
                    System.out.println("Enter c: Nhập thí sinh khối C");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            quanly.add(createSinhvien(scanner, "a"));
                            break;

                        }
                        case "b": {
                        	quanly.add(createSinhvien(scanner, "b"));
                            break;

                        }
                        case "c": {
                        	quanly.add(createSinhvien(scanner, "c"));
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "2": {
                   quanly.showInfor();
                    break;
                }
                case "3": {
                    System.out.print("Nhập mã số thí sinh cần tìm: ");
                    String mssv = scanner.nextLine();
                    SinhVien sinhvien = quanly.searchById(mssv);
                    if (sinhvien == null) {
                        System.out.println("Không tìm thấy");
                    } else {
                        System.out.println(sinhvien.toString());
                    }
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println(" Thông tin không hợp lệ ");
                    continue;
            }

        }
    }


	public static SinhVien createSinhvien(Scanner scanner, String cate) {
        System.out.print("Nhập mssv: ");
        String mssv = scanner.nextLine();
        System.out.print("Nhập tên: ");
        String hoTen = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String diachi = scanner.nextLine();
        System.out.print("Nhập  mức ưu tiên: ");
        String mucuutien = scanner.nextLine();
        scanner.nextLine();
        if (cate.equals("a")) {
            return new KhoiA(mssv, hoTen,diachi,mucuutien);
        } else if (cate.equals("b")) {
        	return new KhoiB(mssv, hoTen,diachi,mucuutien);
        } else {
        	return new KhoiC(mssv, hoTen,diachi,mucuutien);
        }

    }
}
