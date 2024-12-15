package org.collectionss;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetMethods{
	public static void main(String[] args){
		Set set = new LinkedHashSet();

		//add
		set.add(100);
		set.add(2345);
		set.add(73645353);
		set.add(87657685748l);
		set.add(7465.80f);
		set.add(657483746554d);
		set.add('S');
		set.add(true);
		set.add("String");

		//addAll
		Set set1 = new LinkedHashSet();
		set1.add(100);
		set1.add("String");
		set1.add('S');
		set1.add(2345);
		set1.add(true);

		set.addAll(set1);
		System.out.println(set);

		//size
		int size = set.size();
		System.out.println(size);

		//contains
		boolean contains = set.contains("String");
		System.out.println(contains);
		
		//remove
		set.remove(7465.80f);
		System.out.println(set);

		//retainAll
		set.retainAll(set1);
		System.out.println(set);

		//removeAll
		set.removeAll(set1);
		System.out.println(set);


}
}
