package com.training.sdet.day2;

public class LoanClient {
	public static void main(String[] args) {
		Loan l = new HomeLoan(1000);
		showName(l);

		l = new VehicleLoan(2000);
		showName(l);

		l = new Mortage(3000);
		showName(l);
	}

	private static void showName(Loan l) {
		System.out.println("Name :" + l.getName());
		System.out.println("Address :" + l.getAddress());
		System.out.println("ROI :" + l.getROI());
	}

}
