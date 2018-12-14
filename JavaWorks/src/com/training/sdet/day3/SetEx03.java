package com.training.sdet.day3;

import java.util.Set;
import java.util.TreeSet;

//To keep user defined objects
public class SetEx03 {
public static void main(String[] args) {
	Set<Emp> set = new TreeSet<>();
	
	set.add(new Emp(101,"Kumar",3344));
	set.add(new Emp(121,"Ryan",5432));
	set.add(new Emp(133,"Tiara",5544));
	set.add(new Emp(101,"Kumar",3344));
	set.add(new Emp(675,"Archana",5555));
	
	for(Emp temp : set){
		System.out.println(temp+","+temp.hashCode());
	}
	
}
}
