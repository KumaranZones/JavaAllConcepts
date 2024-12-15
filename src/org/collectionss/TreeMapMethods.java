package org.collectionss;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapMethods{
	public static void main(String[] args){
		Map<Character,Integer> map = new TreeMap();

		//put
		map.put('A',100);
		map.put('B',200);
		map.put('C',300);
		map.put('D',400);
		map.put('E',500);
		map.put('F',600);

		//size
		int size = map.size();
		System.out.println(size);

		//get
		int get = map.get('A');
		System.out.println(get);

		//keySet
		Collection<Character> keys = map.keySet();
		System.out.println(keys);

		//values
		Collection<Integer> value = map.values();
		System.out.println(value);

		//containsKey
		boolean conKey = map.containsKey('S');
		System.out.println(conKey);

		//containsValue
		boolean conValue = map.containsValue(800);
		System.out.println(conValue);

		//entrySet
		Set<Entry<Character,Integer>> entrySet = map.entrySet();
		for(Entry<Character,Integer> entry : entrySet){
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());


		}




}
}

