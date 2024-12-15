package org.collectionss;

import java.util.Vector;

public class VectorMethods{
	public static void main(String[] args){
		Vector list = new Vector();

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
		Vector list1 = new Vector();
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
		Object get = list.get(3);
		System.out.println(get);

		//set
		list.set(0,10000);
		System.out.println(list);

		//remove
		list.remove(5);
		System.out.println(list);

		//contains
		boolean contains = list.contains(true);
		System.out.println(contains);

		//indexOf
		int index = list.indexOf(2345);
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

