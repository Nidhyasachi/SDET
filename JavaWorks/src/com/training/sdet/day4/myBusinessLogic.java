package com.training.sdet.day4;

import java.io.*;

public class myBusinessLogic extends Thread {

	//Simulate some time
	public void run() {
		for (int i=0; i<10; i++){
			System.out.println("value of i " +i+ "," + (Thread.currentThread().getName()));
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Thread " + Thread.currentThread().getName() + " Exiting ");
		
	}
}
