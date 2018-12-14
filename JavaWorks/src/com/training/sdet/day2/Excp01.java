package com.training.sdet.day2;

public class Excp01 {
public static void main(String[] args) {
	try {
		//abort call
		try {
			int arr[] = new int[-5];
		}catch(NegativeArraySizeException nase){
			System.out.println(nase);
		}finally {
			System.out.println("I'm the inner final block");
		}
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
				int res = num1 /num2;
				
				System.out.println("Result is " +res);
	}catch (ArithmeticException ae) {
		System.out.println("Division Problem " +ae  );
	}catch (NumberFormatException nfe) {
		System.out.println("Number Format Problem " +nfe  );
	}
	catch (Exception e) {
		e.printStackTrace();
	}finally {
		System.out.println("I'm the final block");
	}
	System.out.println("some business logic");
			
}
}
