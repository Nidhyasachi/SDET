package com.training.sdet.day4;

import java.io.*;

public class ThreadEx01 {
public static void main(String[] args) {
	System.out.println(Thread.currentThread().getName());
	myBusinessLogic mbl = new myBusinessLogic();
	mbl.start();
	
	myBusinessLogic mbl2 = new myBusinessLogic();
	mbl2.start();
	
	myBusinessLogic mbl3 = new myBusinessLogic();
	mbl3.start();
	
	try {
		mbl.join();
		mbl2.join();
		mbl3.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	System.out.println("End of main");
}
}
