package org.runTimeExceptionss;

import java.util.ArrayList;
import java.util.List;

public class IndexOutOfBoundExceptionss {

	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("Java");
		list.add("Selenium");
		
		System.out.println(list.get(2));
	}
}
