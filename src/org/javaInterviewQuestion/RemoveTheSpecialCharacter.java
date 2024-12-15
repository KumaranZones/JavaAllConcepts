package org.javaInterviewQuestion;

public class RemoveTheSpecialCharacter{
	public static void main(String[] args){
		String s = "!J@a^v*a&";

		String removeSpecialCharacter = s.replaceAll("[^a-zA-Z]","");
		System.out.println(removeSpecialCharacter);
}
}

