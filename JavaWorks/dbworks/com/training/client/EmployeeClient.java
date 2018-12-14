package com.training.client;

import org.omg.Messaging.SyncScopeHelper;

import com.training.beans.Employee;
import com.training.dao.EmployeeDAO;
import com.training.standards.IEmployeeDAO;

public class EmployeeClient {

	public static void main(String[] args) {
		Employee employee = new Employee ();
		employee.setEmpId(104);
		employee.setEmpName("Sriram");
		employee.setEmpSal(8000);
		employee.setEmpEmail("Sriram@testing.com");
		
		IEmployeeDAO dao = new EmployeeDAO ();
		//boolean insertFlag = dao.insertEmployee(employee);
		//<condition>? "<True>": "<False>"
		
		//System.out.println(insertFlag?"Record inserted" : "Sorry Record not inserted");
		
		//System.out.println(dao.deleteEmployee(101));
		
		//System.out.println(dao.updateEmployeeSalary(102,88888));
		
		//System.out.println(dao.getEmployee(103));
		
		//System.out.println(dao.getAllEmps()); //will print in 1 line
		
		//dao.getAllEmps().forEach(System.out::println);
		
		dao.getAllEmps1(8000).forEach(System.out::println);
				
	}
}
