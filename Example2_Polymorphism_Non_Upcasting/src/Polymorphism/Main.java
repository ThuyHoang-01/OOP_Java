package Polymorphism;

public class Main {

	public static void main(String args[]) {
		
		 Bank b1 = new VCB(); 
		 Bank b2 = new AGR(); 
		 Bank b3 = new CTG(); 
		 System.out.println("VCB lai suat la: " + b1.getRateOfInterest());
		 System.out.println("AGR lai suat la: " + b2.getRateOfInterest());
		 System.out.println("CTG lai suat la: " + b3.getRateOfInterest());
		 }
}
