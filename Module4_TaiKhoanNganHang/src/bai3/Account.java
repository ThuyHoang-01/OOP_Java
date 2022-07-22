package bai3;

public abstract class Account {
	private int balance;
	private int transactions;
	private int withdrawTimes;
	private int withdrawMoney;

	public abstract int endMonthCharge();

	public Account(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getTransactions() {
		return transactions;
	}

	public void setTransactions(int transactions) {
		this.transactions = transactions;
	}

	public int getWithdrawTimes() {
		return withdrawTimes;
	}

	public void setWithdrawTimes(int withdrawTimes) {
		this.withdrawTimes = withdrawTimes;
	}

	public int getWithdrawMoney() {
		return withdrawMoney;
	}

	public void setWithdrawMoney(int withdrawMoney) {
		this.withdrawMoney = withdrawMoney;
	}

	public boolean deposit(int money) {
		if (money > 0) {
			transactions++;
			balance = balance + money;
			return true;
		} else
			return false;
	}

	public boolean withdraw(int money) {
		if (money > 0) {
			transactions++;
			withdrawTimes++;
			balance = balance - money;
			withdrawMoney += money;
			return true;
		} else
			return false;
	}

	public abstract void endMonth();

	@Override
	public String toString() {
		return "Account [balance=" + balance + ", transactions=" + transactions + "]";
	}
}
