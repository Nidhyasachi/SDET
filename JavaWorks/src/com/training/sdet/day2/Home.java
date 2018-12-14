package com.training.sdet.day2;

public class Home implements BankLoan{

	@Override
	public void loanAmount(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Home Loan amount is "+ amount);
	}

	@Override
	public void repay(int repayAmount) {
		// TODO Auto-generated method stub
		System.out.println("Home Loan repay amount is "+ repayAmount);
		
	}

	@Override
	public void foreClosure() {
		// TODO Auto-generated method stub
		System.out.println("Forclosure will charge 2.3%");
	}

}
