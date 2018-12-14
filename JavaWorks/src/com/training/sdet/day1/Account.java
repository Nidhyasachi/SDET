package com.training.sdet.day1;

public class Account {
	private int accId;
	private double accBalance;
	private Name name;
	
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public double getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Account [accId=" + accId + ", accBalance=" + accBalance + ", name=" + name + "]";
	}	


		
	
	
	}

    
  
	

