package org.javaInterviewQuestion;

public class HowToConcatTheTwoInteger{
	public static void main(String[] args){
		int a = 1234;
		int b = 5678;

		String v1 = String.valueOf(a);
		String v2 = String.valueOf(b);

		String v3 = v1.concat(v2);
		System.out.println(v3);
}
}
