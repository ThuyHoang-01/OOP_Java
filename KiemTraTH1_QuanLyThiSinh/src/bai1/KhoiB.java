package bai1;

public class KhoiB extends SinhVien{

	public static final String MON_TOAN = "Toan";
    public static final String MON_HOA = "Hoa";
     public static final String MON_SINH = "Sinh";
   
	public KhoiB() {
		super();
		// TODO Auto-generated constructor stub
	}
	public KhoiB(String hoTen, String mssv, String diachi, String mucuutien) {
		super(hoTen, mssv, diachi, mucuutien);
		// TODO Auto-generated constructor stub
	}
	@Override
    public String toString() {
        return "KhoiB{" +
                "mssv='" + mssv + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", diachi='" + diachi + '\'' +
                ", mucuutien=" + mucuutien+ ", Subject: " + MON_TOAN + " - " + MON_HOA + " - " + MON_SINH +
                '}';
    }
}
