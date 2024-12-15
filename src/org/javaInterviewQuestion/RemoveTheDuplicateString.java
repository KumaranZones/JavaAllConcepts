package org.javaInterviewQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveTheDuplicateString {
	public static void main(String[] args) {
		Set set = new TreeSet();

		set.add("Java");
		set.add("Selenium");
		set.add("Java");
		set.add("Maven");
		set.add("Selenium");
		set.add("Maven");

		System.out.println(set);
		//Set set = new TreeSet(list);
//		List list1 = new ArrayList(set);
//		System.out.println(list1);

		for(Object ss : set) {
			System.out.println(ss);
		}
	}
}
