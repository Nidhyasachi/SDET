package com.training.sdet.day1;

public class Employee extends Person{
        private double empSalary;
        private String projName;
        
		public double getEmpSalary() {
			return empSalary;
		}
		public void setEmpSalary(double empSalary) {
			this.empSalary = empSalary;
		}
		public String getProjName() {
			return projName;
		}
		public void setProjName(String projName) {
			this.projName = projName;
		}
		@Override
		public String toString() {
			return "Employee [empSalary=" + empSalary + ", projName=" + projName + "]" + super.toString();
		}
}
		
        
        
