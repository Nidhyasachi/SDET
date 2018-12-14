package com.training.sdet.day2;

public class Account implements Comparable<Account> {
	// stored in heap
	private int accountId;
	private String name;
	private double balance;

	// stored in stack
	private static int count=100; 

	public Account(String name, double balance) {
		super();
		this.accountId = count ++;
		this.name = name;
		this.balance = balance;
	}

	public static int getCount() {
		return count;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccountId() {
		return accountId;
	}
	public String getName() {
		return name;
	}
	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", name=" + name + ", balance=" + balance + "]";
	}

	@Override
	public int compareTo(Account o) {
		// TODO Auto-generated method stub
		//return this.getAccountId() - o.getAccountId(); //Asc order
		//return o.getAccountId() - this.getAccountId();
		return this.getName().compareTo(o.getName());
	}

}
