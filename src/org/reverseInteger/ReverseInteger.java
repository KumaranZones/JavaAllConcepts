package org.reverseInteger;

public class ReverseInteger {

	public static void main(String[] args) {
		int a = 7654;
		String value = String.valueOf(a);
		
		char[] charArray = value.toCharArray();
		
		for(int i=charArray.length-1; i>=0; i--) {
			System.out.print(charArray[i]);
		}
		
	}
}
