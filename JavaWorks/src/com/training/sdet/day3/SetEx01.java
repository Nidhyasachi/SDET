package com.training.sdet.day3;

import java.util.HashSet;
import java.util.Set;

//type safe of string
public class SetEx01 {
public static void main(String[] args) {
	Set<String> mySet = new HashSet<>(); //Hashset is a class that implements a interface called Set
	
	System.out.println(mySet.add("Raj"));
	System.out.println(mySet.add("Bryan"));
	System.out.println(mySet.add("Raj"));
	System.out.println(mySet.add("Bryan"));

	System.out.println(mySet.size());
	System.out.println(mySet);
}
}
