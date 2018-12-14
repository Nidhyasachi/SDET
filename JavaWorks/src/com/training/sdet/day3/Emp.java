package com.training.sdet.day3;

public class Emp implements Comparable <Emp> {
	private static final Emp obj = null;
	private int empId;
	private String empName;
	private double empSal;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	// Default Constructor
	// public Emp(){}

	// Parameter Constructor
	public Emp(int empId, String empName, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Emp emp = (Emp) obj;
		//Option 1
		//if (this.empId == emp.empId && this.empName.equals(emp.getEmpName()) && this.empSal == emp.empSal) {
		//	return true;
		//} else {
		//	return false;
		//}
		
		//Option 2
		return 
			this.empId == emp.empId && this.empName.equals(emp.getEmpName()) && this.empSal == emp.empSal;
		
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		// default -> return super.hashCode();
		return this.empName.charAt(0);
	}

	@Override
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		return this.empId - o.getEmpId();
	}
	

}
