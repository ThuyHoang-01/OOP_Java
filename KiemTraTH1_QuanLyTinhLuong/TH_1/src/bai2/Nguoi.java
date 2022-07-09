package bai2;

public class Nguoi {
	private String HoTen;
	private int Tuoi;
	private String QueQuan;
	private String MSGV;

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	public int getTuoi() {
		return Tuoi;
	}

	public void setTuoi(int tuoi) {
		Tuoi = tuoi;
	}

	public String getQueQuan() {
		return QueQuan;
	}

	public void setQueQuan(String queQuan) {
		QueQuan = queQuan;
	}

	public String getMSGV() {
		return MSGV;
	}

	public void setMSGV(String mSGV) {
		MSGV = mSGV;
	}

	public Nguoi(String hoTen, int tuoi, String queQuan, String mSGV) {
		super();
		HoTen = hoTen;
		Tuoi = tuoi;
		QueQuan = queQuan;
		MSGV = mSGV;
	}

	public Nguoi() {
	}

	public Nguoi(String mSGV) {
		super();
		MSGV = mSGV;
	}

	@Override
	public String toString() {
		return "Nguoi [HoTen=" + HoTen + ", Tuoi=" + Tuoi + ", QueQuan=" + QueQuan + ", MSGV=" + MSGV + "]";
	}

}
