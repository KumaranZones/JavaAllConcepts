package org.collectionss2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IterateTheLinkedHashMap{
	public static void main(String[] args){
		Map<String,Integer> map = new LinkedHashMap();

		map.put("Java",100);
		map.put("Selenium",200);
		map.put("Maven",300);
		map.put("DataDriven",400);
		map.put("Cucumber",500);
		map.put("TestNG",600);

		Set<Entry<String,Integer>> entrySet = map.entrySet();
		for(Entry<String,Integer> entry : entrySet){
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
}
