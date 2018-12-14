package com.training.sdet.day3;

import java.util.Vector;

//Pgm to show working of vector
public class CollectionEx03 {
public static void main(String[] args) {
	Vector<Integer> vector = new Vector<>(5,7);
	
	System.out.println("Size "+vector.size());
	System.out.println("Capacity "+vector.capacity());
	
	vector.add(1);
	vector.add(2);
	vector.add(3);
	vector.add(4);
	vector.add(5);
	vector.add(6);
	vector.add(7);
	vector.add(8);
	vector.add(9);
	vector.add(10);
	
	vector.add(11);
	
	System.out.println("Size "+vector.size());
	System.out.println("Capacity "+vector.capacity());
	
}
}

