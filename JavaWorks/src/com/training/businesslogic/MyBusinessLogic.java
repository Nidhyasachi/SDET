package com.training.businesslogic;

public class MyBusinessLogic {

	public int insertRecord(int empId, String empName){
		System.out.println("Inserting EmpId" + empId + ", Name" + empName);
	
		return 1;
	}
	
	public String sayHello(String name){
		return "Hello" + name;
	}
}
