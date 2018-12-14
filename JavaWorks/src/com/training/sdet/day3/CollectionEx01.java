package com.training.sdet.day3;

import java.util.ArrayList;
import java.awt.List;
import java.util.Iterator;

public class CollectionEx01 {
   public static void main(String[] args) {
	List list = new ArrayList();
	
	list.add("Hello");
	list.add(34.5);
	list.add(true);
	list.add(new Object());
	
	System.out.println(list);
	
	Iterator itr = list.iterator();
	
	//array start from 0
	//Iterator start from -1
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	
	}
}
