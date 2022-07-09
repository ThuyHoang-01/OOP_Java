package overriding;

public class BankApp {
	public static void main(String args[]) {
		 VCB s = new VCB();
		 AGR i = new AGR();
		 CTG a = new CTG();
		 System.out.println("VCB Rate of Interest: " + s.getRateOfInterest());
		 System.out.println("AGR Rate of Interest: " + i.getRateOfInterest());
		 System.out.println("CTG Rate of Interest: " + a.getRateOfInterest());
		 }

}
