package org.collectionss2;

import java.util.Iterator;
import java.util.TreeSet;

public class IterateTreeSet{
	public static void main(String[] args){
		TreeSet set = new TreeSet();

		set.add("Java");
		set.add("Selenium");
		set.add("Maven");
		set.add("DataDriven");
		set.add("TestNG");
		set.add("Cucumber");
		set.add("API Testing");
		set.add("Postman");
		set.add("RestAssured");

		for(Object sets : set){
			System.out.println(sets);
		}	

		Iterator iter = set.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		Iterator<Object> dIter = set.descendingIterator();
		while(dIter.hasNext()){
			System.out.println(dIter.next());
		}
}
}
