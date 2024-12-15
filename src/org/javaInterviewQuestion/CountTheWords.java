package org.javaInterviewQuestion;

public class CountTheWords{
	public static void main(String[] args){
		String s = "Java Selenium Maven DataDriven";

		int count = 0;
		String[] split = s.split(" ");
		for(String ss : split){
			count++;
			System.out.println(ss);
		}
		System.out.println(count);
}
}
