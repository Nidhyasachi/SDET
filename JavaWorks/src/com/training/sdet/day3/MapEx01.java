package com.training.sdet.day3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx01 {
public static void main(String[] args) {
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	
	map.put("Harry", 4000);
	map.put("Peter", 4055);
	map.put("Britt", 2233);
	
	//System.out.println("Harry Balance " + map.get("Harry"));
	//System.out.println("Peter Balance " + map.get("Peter"));
	//System.out.println("Britt Balance " + map.get("Britt"));
	
	Set st = map.entrySet();
	Iterator itr = st.iterator();
	
	while(itr.hasNext()){
		Map.Entry element = (Entry) itr.next();
		
		System.out.println(element.getKey() +","+element.getValue());
		
	}
	
}
}
