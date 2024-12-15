package org.javaInterviewQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortTheString {
	public static void main(String[] args) {
		List list = new ArrayList();

		list.add("Java");
		list.add("Selenium");
		list.add("DataDriven");
		list.add("Maven");
		list.add("TestNG");
		list.add("Cucumber");

		Set set = new TreeSet(list);
		List list1 = new ArrayList(set);
		System.out.println(list1);
		
		for(Object ss : list1) {
			System.out.println(ss);
		}

	}
}
