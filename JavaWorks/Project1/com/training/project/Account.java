package com.training.project;

public class Account {
private int accId;
private int accNo;
private double accBal;
private double avgBal;
private double percent;

//Default Constructor
public Account() {};
//Parameterized Constructor
public Account(int accId, int accNo, double accBal, double avgBal, double percent) {
	super();
	this.accId = accId;
	this.accNo = accNo;
	this.accBal = accBal;
	this.avgBal = avgBal;
	this.percent = percent;
}

public int getAccId() {
	return accId;
}
public void setAccId(int accId) {
	this.accId = accId;
}
public int getAccNo() {
	return accNo;
}
public void setAccNo(int accNo) {
	this.accNo = accNo;
}
public double getAccBal() {
	return accBal;
}
public void setAccBal(double accBal) {
	this.accBal = accBal;
}
public double getAvgBal() {
	return avgBal;
}
public void setAvgBal(double avgBal) {
	this.avgBal = avgBal;
}
public double getPercent() {
	return percent;
}
public void setPercent(double percent) {
	this.percent = percent;
}
@Override
public String toString() {
	return "Account [accId=" + accId + ", accNo=" + accNo + ", accBal=" + accBal + ", avgBal=" + avgBal + ", percent="
			+ percent + "]";
}

}
