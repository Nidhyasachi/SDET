package com.training.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.training.beans.Employee;
import com.training.connection.GetConnection;
import com.training.standards.IEmployeeDAO;

public class EmployeeDAO implements IEmployeeDAO {

	@Override
	public boolean insertEmployee(Employee emp) {
		//arrays start from 0
		//Iterators start from -1
		//positional parameters -1
		try {
			String sql = "insert into employee values (?,?,?,?)";
			
			GetConnection gc = new GetConnection();
			gc.ps = GetConnection.getMySqlConnection().prepareStatement(sql);
			
			gc.ps.setInt(1, emp.getEmpId());
			gc.ps.setString(2,emp.getEmpName());
			gc.ps.setDouble(3, emp.getEmpSal());
			gc.ps.setString(4,emp.getEmpEmail());
			
			return gc.ps.executeUpdate()>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		String sql = "delete from employee where empid =?";
		GetConnection gc = new GetConnection();
		try {
			gc.ps = GetConnection.getMySqlConnection().prepareStatement(sql);
			
			gc.ps.setInt(1,empId);
			
			return gc.ps.executeUpdate()>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{	
		try {
			gc.ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		return false;
	}
	@Override
	public boolean updateEmployeeSalary(int empId, double newSalary) {
		String sql = "update employee set empsal =? where empid=?";
		GetConnection gc = new GetConnection();
		try {
			gc.ps = GetConnection.getMySqlConnection().prepareStatement(sql);
			
			gc.ps.setInt(2,empId);
			gc.ps.setDouble(1, newSalary);
		
			return gc.ps.executeUpdate()>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try{
				gc.ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}

	@Override
	public Employee getEmployee(int empId) {
		String sql = "select * from employee where empid=?";
		GetConnection gc = new GetConnection();
		
		try {
			gc.ps = GetConnection.getMySqlConnection().prepareStatement(sql);
			
			gc.ps.setInt(1,empId);
			
			gc.rs=gc.ps.executeQuery();
			
			if (gc.rs.next()) {
				Employee employee = new Employee();
				employee.setEmpId(gc.rs.getInt(1));
				employee.setEmpName(gc.rs.getString(2));
				employee.setEmpSal(gc.rs.getDouble(3));
				employee.setEmpEmail(gc.rs.getString(4));
				
				return employee;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Employee> getAllEmps() {
		String sql = "select * from employee";
		GetConnection gc = new GetConnection();
		List<Employee> empList = new ArrayList<Employee> ();	
		
		try {
			gc.ps = GetConnection.getMySqlConnection().prepareStatement(sql);			
			gc.rs=gc.ps.executeQuery();
			
			while (gc.rs.next()) {
				Employee employee = new Employee();
				employee.setEmpId(gc.rs.getInt(1));
				employee.setEmpName(gc.rs.getString(2));
				employee.setEmpSal(gc.rs.getDouble(3));
				employee.setEmpEmail(gc.rs.getString(4));
				
				empList.add(employee);
			}
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try{
				gc.ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return empList;
	}

	@Override
	public List<Employee> getAllEmps1(double empSal) {
		String sql = "select * from employee where empsal>?";
		GetConnection gc = new GetConnection();
		List<Employee> empList = new ArrayList<Employee> ();	
		
				
		try {
			gc.ps = GetConnection.getMySqlConnection().prepareStatement(sql);	
			gc.ps.setDouble(1, empSal);
			gc.rs=gc.ps.executeQuery();
			
			while (gc.rs.next()) {
				Employee employee = new Employee();
				employee.setEmpId(gc.rs.getInt(1));
				employee.setEmpName(gc.rs.getString(2));
				employee.setEmpSal(gc.rs.getDouble(3));
				employee.setEmpEmail(gc.rs.getString(4));
				
				empList.add(employee);
			}
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try{
				gc.ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return empList;
	}

	
}
