package com.training.standards;

import java.util.List;

import com.training.beans.Employee;

public interface IEmployeeDAO {
  //CRUD
	
	public boolean insertEmployee (Employee emp);
	public boolean deleteEmployee (int empId);
	public boolean updateEmployeeSalary (int empId, double empSal);
	
	public Employee getEmployee(int empId);
	public List<Employee> getAllEmps();
	public List<Employee> getAllEmps1(double empSal);
	
	
}
