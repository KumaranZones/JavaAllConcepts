package org.collectionss;

import java.util.TreeSet;

public class TreeSetMethods{
	public static void main(String[] args){
		TreeSet set = new TreeSet();

		//add
		set.add("Java");
		set.add("Selenium");
		set.add("Maven");
		set.add("DataDriven");
		set.add("TestNg");
		set.add("Cucumber");
		set.add("POM");
		set.add("Jira");

		TreeSet set1 = new TreeSet();

		set1.add("TestNg");
		set1.add("Cucumber");
		set1.add("POM");
		set1.add("Jira");

		//addAll
		set.addAll(set1);
		System.out.println(set);

		//size
		int size = set.size();
		System.out.println(size);

		//contains
		boolean contains = set.contains("RestAssured");
		System.out.println(contains);

		//remove
		set.remove("DataDriven");
		System.out.println(set);

		//retainAll
		set.retainAll(set1);
		System.out.println(set);

		//removeAll
		set.remove(set1);
		System.out.println(set);

	}
}

