package bai1;

public class KhoiA extends SinhVien {
	
	public static final String MON_TOAN = "Toan";
    public static final String MON_LY = "Ly";
    public static final String MON_HOA = "Hoa";
    
    public KhoiA() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KhoiA(String hoTen, String mssv, String diachi, String mucuutien) {
		super(hoTen, mssv, diachi, mucuutien);
		// TODO Auto-generated constructor stub
	}

	@Override
    public String toString() {
        return "KhoiA{" +
                "mssv='" + mssv + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", diachi='" + diachi + '\'' +
                ", mucuutien=" + mucuutien+ ", Subject: " + MON_TOAN + " - " + MON_LY + " - " + MON_HOA +
                '}';
    }
}
