package org.javaInterviewQuestion;

public class HowToSeparateTheCharacterAndInteger{
	public static void main(String[] args){
		String s6 = "Kumaran123456";
		String subs = s6.substring(8);
		System.out.println(subs);
		
		int sepI = Integer.parseInt(subs);
		System.out.println(sepI);

}
}
