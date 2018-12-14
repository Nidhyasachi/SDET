package com.training.sdet.day2;

public abstract class Loan{
	private int loanAmount;
	
	public Loan(int loanAmount){
		this.loanAmount = loanAmount;
	}
	
	
	public int getLoanAmount() {
		return loanAmount;
	}


	public String getName() {
		return "Nidhya";
	}

	public String getAddress() {
		return "American Dream Way, Reston";
	}
	// <access specifiers> <access modifiers> <return type/void> method (args)
	// public private protected default
	// abstract final static synchronize
	public abstract double getROI();
}

