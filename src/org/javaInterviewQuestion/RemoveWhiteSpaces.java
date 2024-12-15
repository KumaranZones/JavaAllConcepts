package org.javaInterviewQuestion;

public class RemoveWhiteSpaces{
	public static void main(String[] args) {
		String s = "     J     a       v       a      ";
		String removeWhiteSpaces = s.replaceAll("\\s","");
		System.out.println(removeWhiteSpaces);
}
}

