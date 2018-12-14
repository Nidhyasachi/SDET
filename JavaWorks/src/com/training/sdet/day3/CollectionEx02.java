package com.training.sdet.day3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class CollectionEx02 {
public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	
	list.add("Hello");
	list.add("Welcome");
		
	//For Developers - Option 1
	for(String temp: list){
		System.out.println(temp);
	}
	//Option 2
	Iterator<String> itr = list.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	
}
}
