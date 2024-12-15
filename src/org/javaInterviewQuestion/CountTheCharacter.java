package org.javaInterviewQuestion;

public class CountTheCharacter{
	public static void main(String[] args){
		String s = "selenium";

		int count = 0 ;
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)=='a'||
		s.charAt(i)=='b'||
		s.charAt(i)=='c'||
		s.charAt(i)=='d'||
		s.charAt(i)=='e'||
		s.charAt(i)=='f'||
		s.charAt(i)=='g'||
		s.charAt(i)=='h'||
		s.charAt(i)=='i'||
		s.charAt(i)=='j'||
		s.charAt(i)=='k'||
		s.charAt(i)=='l'||
		s.charAt(i)=='m'||
		s.charAt(i)=='n'||
		s.charAt(i)=='o'||
		s.charAt(i)=='p'||
		s.charAt(i)=='q'||
		s.charAt(i)=='r'||
		s.charAt(i)=='s'||
		s.charAt(i)=='t'||
		s.charAt(i)=='u'||
		s.charAt(i)=='v'||
		s.charAt(i)=='w'||
		s.charAt(i)=='x'||
		s.charAt(i)=='y'||
		s.charAt(i)=='z'){
			count++;
			}
		}
		System.out.println(count);
}
}
