package com.training.sdet.day1;

public class Name {
private String firstName;
private String MiddleName;
private String lastName;
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getMiddleName() {
	return MiddleName;
}
public void setMiddleName(String middleName) {
	MiddleName = middleName;
}

public String toString() {
	return this.getFirstName() + " " + this.getLastName();
	
}

}
