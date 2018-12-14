package com.training.sdet.day1;

class A{
	A(int x){
		System.out.println("I'm from Class A");
		System.out.println("INT x = " + x);
	}
	
}
class B extends A{
	B(int x){
		super(x);
	    System.out.println("I'm from Class B");
	
	}
}

public class InheritanceSample {
 public static void main(String[] args) {
	B objB = new B (10);
}
}
