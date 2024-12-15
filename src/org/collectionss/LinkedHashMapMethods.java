package org.collectionss;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapMethods{
	public static void main(String[] args){
		Map<Integer,Character> map = new LinkedHashMap();

		//put
		map.put(100,'A');
		map.put(200,'B');
		map.put(300,'C');
		map.put(400,'D');
		map.put(500,'E');
		map.put(600,'F');

		//size
		int size = map.size();
		System.out.println(size);

		//get
		char get = map.get(200);
		System.out.println(get);

		//keySet
		Collection<Integer> keys = map.keySet();
		System.out.println(keys);

		//values
		Collection<Character> value = map.values();
		System.out.println(value);

		//containsKey
		boolean conKeys = map.containsKey(600);
		System.out.println(conKeys);

		//containsValue
		boolean conValue = map.containsValue('H');
		System.out.println(conValue);

		//entrySet
		Set<Entry<Integer,Character>> entrySets = map.entrySet();
		for(Entry<Integer,Character> entry : entrySets){
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());

		}
	}
}

