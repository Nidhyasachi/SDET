package com.training.sdet.day4;

public class Account {
private int balance;

public Account(int balance){
	this.balance = balance;
	}
public synchronized void withdraw(int amount){
	if(amount<balance){
		System.out.println("Amount " +amount+" withdrawn by " +Thread.currentThread().getName());
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		balance = balance - amount;
		System.out.println("Remaining balance after withdraw is " +balance);
	}else {
		System.out.println("Sorry! " + Thread.currentThread().getName() + " Your current balance is " + balance);
				
	}
}
}
