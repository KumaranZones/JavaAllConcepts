package org.collectionss;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapMethods{
	public static void main(String[] args){
		Map<String,Integer> map = new HashMap();
		
		//put
		map.put("Java",1000);
		map.put("Selenium",2000);
		map.put("Maven",3000);
		map.put("DataDriven",4000);
		map.put("TestNG",5000);
		map.put("Cucumber",6000);
		map.put("Postman",7000);
		map.put("RestAssured",8000);

		//size
		int size = map.size();
		System.out.println(size);
	
		//get
		Object get = map.get("Postman");
		System.out.println(get);

		//keySet
		Set<String> keys = map.keySet();
		System.out.println(keys);

		//values
		Collection<Integer> value = map.values();
		System.out.println(value);

		//containsKey
		boolean conKey = map.containsKey("Selenium");
		System.out.println(conKey);

		//containsValue
		boolean conValue = map.containsValue(3000);
		System.out.println(conValue);

		//entrySet
		Set<Entry<String,Integer>> entrySets = map.entrySet();
		for(Entry<String,Integer> entry : entrySets){
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

}
}

