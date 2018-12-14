package com.training.sdet.day2;

public class BankLoanClient {
public static void main(String[] args) {
	BankLoan bk = new Personal();
	bk.foreClosure();
	bk.loanAmount(3000);
	bk.repay(200);
	System.out.println("-----------------------");
	bk = new Home();
	bk.foreClosure();
	bk.loanAmount(5000);
	bk.repay(400);
}
}
