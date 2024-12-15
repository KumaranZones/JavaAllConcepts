package org.javaInterviewQuestion;

public class SortTheCharacterInDescendingOrder{
	public static void main(String[] args){
		String s = "Javass";
		char temp;

		char[] charArray = s.toCharArray();
		for(int i=0; i<charArray.length; i++){
			for(int j=i+1; j<charArray.length; j++){
				if(charArray[i]<charArray[j]){
					temp = charArray[i];
					charArray[i] = charArray[j];
					charArray[j] = temp;
				}
			}
		}
		System.out.println(charArray);

}
}

