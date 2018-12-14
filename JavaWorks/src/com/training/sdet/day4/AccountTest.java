package com.training.sdet.day4;

public class AccountTest implements Runnable {
private Account account;
private int amount;
private Thread t;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (account) {
			account.withdraw(amount);
			}
	}
	public AccountTest(Account account, int amount, String custName){
		this.account = account;
		this.amount = amount;
		t = new Thread(this,custName);
		t.start();
		
	}
	public static void main(String[] args) {
		Account account = new Account(1000);
		new AccountTest(account, 500, "Henry");
		new AccountTest(account, 750, "Kim");
	}
	

	

}
