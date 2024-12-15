package org.javaInterviewQuestion;

import java.util.TreeSet;

public class RemoveTheDuplicateInteger{
	public static void main(String[] args){
		int[] a = {23,34,34,45,56,67,78,89,89};

		TreeSet set = new TreeSet();

		for(int i=0; i<a.length; i++){
			set.add(a[i]);
		}
		for(Object ss  : set){
			System.out.print(ss+",");
		}
}
}

