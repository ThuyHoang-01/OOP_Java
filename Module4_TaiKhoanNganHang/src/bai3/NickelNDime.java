package bai3;

public class NickelNDime extends Account {

	public NickelNDime(int balance) {
		super(balance);
	}

	@Override
	public int endMonthCharge() {
		return 2000 * super.getWithdrawTimes();
	}

	@Override
	public void endMonth() {
		String accountBalance = super.getBalance() + "";
		String accountTransactions = super.getTransactions() + "";
		String accountFee = endMonthCharge() + "";
		String finalBalance = super.getBalance() - endMonthCharge() + "";

		System.out.println("NickelNDime Account detail:\n" + "Original Balance: " + accountBalance + "\nTransactions: "
				+ accountTransactions + "\nFee: " + accountFee + "\nCurrent Balance: " + finalBalance);

		super.setTransactions(0);
		super.setWithdrawMoney(0);
	}

}

