package org.collectionss2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterateTheHashSet{
	public static void main(String[] args){
		Set set = new HashSet();

		set.add(100);
		set.add(2345);
		set.add(73645353);
		set.add(87657685748l);
		set.add(7465.80f);
		set.add(657483746554d);
		set.add('S');
		set.add(true);
		set.add("String");

		//ForEach
		for(Object lists : set){
			System.out.println(lists);
		}

		//Iterator
		Iterator iter = set.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		
}
}
