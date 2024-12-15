package org.javaInterviewQuestion;

import java.util.TreeSet;

public class RemoveTheDuplicateCharacter{
	public static void main(String[] args){
		String s = "Javas";
		TreeSet set = new TreeSet();

		for(int i=0; i<s.length(); i++){
			set.add(s.charAt(i));
		}
		System.out.println(set);
}
}
