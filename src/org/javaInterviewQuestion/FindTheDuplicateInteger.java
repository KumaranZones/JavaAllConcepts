package org.javaInterviewQuestion;

public class FindTheDuplicateInteger{
	public static void main(String[] args){
		int[] a = {23,34,34,45,56,67,78,89,89};

		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i]==a[j]){
					System.out.println(a[i]);
				}
			}
		}

}
}

