package org.javaInterviewQuestion;

public class PalindromOrNot {

	public static void main(String[] args) {
		String s = "malayalam";
		String s1 = "";
		char[] charArray = s.toCharArray();
		for(int i=charArray.length-1; i>=0; i--) {
			s1  += charArray[i];
		}
		if(s1.equals(s)) {
			System.out.println("This is palindrom word");
		}else {
			System.out.println("This is not a palindrom word");
		}
	}
}
