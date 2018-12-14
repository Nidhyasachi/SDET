package com.training.sdet.day1;

public class PersonInher {
public static void main(String[] args) {
	Employee emp = new Employee();
	emp.setPersonId(101);emp.setEmpSalary(10000);
	emp.setPersonName("Nidhya");
	emp.setProjName("MFTS");
	
	System.out.println(emp);
	
	Customer cust = new Customer();
	cust.setIncome(20000);cust.setPersonId(201);
	cust.setPersonName("Sachi");
	System.out.println(cust);
	
	//InherMethod1();
	
	Person p = new Employee();
	p.setPersonId(301);
	p.setPersonName("Ram");
	((Employee)p).setEmpSalary(35000);
	((Employee)p).setProjName("CIE");
	
	System.out.println(p);
}

}
