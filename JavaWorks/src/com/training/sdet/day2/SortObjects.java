package com.training.sdet.day2;

import java.util.Arrays;

public class SortObjects {
public static void main(String[] args) {
	int [] arr = {12,5,7,2,19,234,123,111};
	
	for (int temp:arr){
		System.out.println(temp);
	}
	System.out.println("----After Sort---");
	Arrays.sort(arr);
	for (int temp:arr){
		System.out.println(temp);
	}
	
	String [] sarr = {"hello","how","are","today","you"};
	Arrays.sort(sarr);
	
	for (String temp:sarr)
	{
		System.out.println(temp);
	}
}
}
