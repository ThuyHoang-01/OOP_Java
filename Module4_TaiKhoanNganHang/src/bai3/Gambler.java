package bai3;

public class Gambler extends Account {

	public Gambler(int balance) {
		super(balance);
	}

	@Override
	public int endMonthCharge() {
		double probability = ((double) super.getWithdrawTimes() / (double) super.getTransactions()) * 100;
		int accountFee = 0;
		if (probability <= 50) {
			accountFee = 0;
		} else if (probability > 50) {
			accountFee = super.getWithdrawMoney();
		}
		return accountFee;
	}

	@Override
	public void endMonth() {
		String accountBalance = super.getBalance() + "";
		String accountTransactions = super.getTransactions() + "";
		String accountFee = endMonthCharge() + "";
		String finalBalance = super.getBalance() - endMonthCharge() + "";

		System.out.println("Gambler Account detail:\n" + "Original Balance: " + accountBalance + "\nTransactions: "
				+ accountTransactions + "\nFee: " + accountFee + "\nCurrent Balance: " + finalBalance);

		super.setTransactions(0);
		super.setWithdrawMoney(0);
	}

}