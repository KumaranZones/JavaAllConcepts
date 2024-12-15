package org.collectionss;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods{
	public static void main(String[] args){
		List list = new ArrayList();

		//add
		list.add(100);
		list.add(2345);
		list.add(73645353);
		list.add(87657685748l);
		list.add(7465.80f);
		list.add(657483746554d);
		list.add('S');
		list.add(true);
		list.add("String");

		//addAll
		List list1 = new ArrayList();
		list1.add(100);
		list1.add("String");
		list1.add('S');
		list1.add(2345);
		list1.add(true);
		
		list.addAll(list1);
		System.out.println(list);

		//size
		int size = list.size();
		System.out.println(size);

		//get
		Object get = list.get(6);
		System.out.println(get);

		//set
		list.set(0,1000);
		System.out.println(list);

		//remove
		list.remove(657483746554d);
		System.out.println(list);
	
		//contains
		boolean contains = list.contains("String");
		System.out.println(contains);

		//indexOf
		int index = list.indexOf("String");
		System.out.println(index);

		//retainAll
		list.retainAll(list1);
		System.out.println(list);

		//removeAll
		list.removeAll(list1);
		System.out.println(list);

		//clear
		list.clear();
		System.out.println(list);


	}
}

