package bai1;

public class KhoiC extends SinhVien{

	public static final String MON_VAN = "Van";
    public static final String MON_SU = "Su";
     public static final String MON_DIA = "Dia";
   
	public KhoiC() {
		super();
		// TODO Auto-generated constructor stub
	}
	public KhoiC(String hoTen, String mssv, String diachi, String mucuutien) {
		super(hoTen, mssv, diachi, mucuutien);
		// TODO Auto-generated constructor stub
	}
	@Override
    public String toString() {
        return "KhoiC{" +
                "mssv='" + mssv + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", diachi='" + diachi + '\'' +
                ", mucuutien=" + mucuutien+ ", Subject: " + MON_VAN + " - " + MON_SU + " - " + MON_DIA +
                '}';
    }
}
