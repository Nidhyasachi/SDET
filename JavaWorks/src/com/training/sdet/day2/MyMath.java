package com.training.sdet.day2;
//Class
public class MyMath {
	static int x=100;
	static int add(int num1, int num2){
		System.out.println("the static value of x is "+x);
		return num1 + num2 + x ;
		}
	
	static int sub(int num1, int num2){
		return num1 - num2;
		}
	
    //Main Method
	public static void main(String[] args) {
		//MyMath m = new MyMath();
		//System.out.println(m.add(10, 20));
		
		System.out.println(add(10, 20));
		System.out.println(sub(20, 10));
		
	}
	
}
