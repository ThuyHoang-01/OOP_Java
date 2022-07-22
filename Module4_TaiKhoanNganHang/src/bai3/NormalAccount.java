package bai3;

public class NormalAccount extends Account {

	public NormalAccount(int balance) {
		super(balance);
	}

	@Override
	public int endMonthCharge() {
		return 10000;
	}

	@Override
	public void endMonth() {
		String accountBalance = super.getBalance() + "";
		String accountTransactions = super.getTransactions() + "";
		String accountFee = endMonthCharge() + "";
		String finalBalance = super.getBalance() - endMonthCharge() + "";

		System.out.println("Normal Account detail:\n" + "Original Balance: " + accountBalance + "\nTransactions: "
				+ accountTransactions + "\nFee: " + accountFee + "\nCurrent Balance: " + finalBalance);

		super.setTransactions(0);
		super.setWithdrawMoney(0);
	}

}