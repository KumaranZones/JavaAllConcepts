package org.javaInterviewQuestion;

public class FindTheDupicateCharacter{
	public static void main(String[] args){
		String s = "Javass";

		char[] charArray = s.toCharArray();
		for(int i=0; i<charArray.length; i++){
			for(int j=i+1; j<charArray.length; j++){
				if(charArray[i]==charArray[j]){
					System.out.println(charArray[i]);
				}
			}
		}

}
}
