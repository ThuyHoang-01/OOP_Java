package bai3;

public class Main {

	public static void main(String[] args) {
		Account normal = new NormalAccount(20000);
		normal.deposit(1000);
		normal.withdraw(500);
		if (normal.getTransactions() > 0) {
			normal.endMonth();
		} else {
			System.out.println("No transactions for Normal Account");
		}

		System.out.println("-------------");
		Account gambler = new Gambler(40000);
		gambler.deposit(1000);
		gambler.withdraw(500);
		gambler.withdraw(2500);
		gambler.withdraw(1000);
		if (gambler.getTransactions() > 0) {
			gambler.endMonth();
		} else {
			System.out.println("No transactions for Gambler Account");
		}

		System.out.println("-------------");
		Account nickel = new NickelNDime(50000);
		nickel.deposit(1000);
		nickel.withdraw(500);
		nickel.withdraw(2000);
		nickel.withdraw(1000);
		if (nickel.getTransactions() > 0) {
			nickel.endMonth();
		} else {
			System.out.println("No transactions for NickelNDime Account");
		}
	}

}
