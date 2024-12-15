package org.javaInterviewQuestion;

public class FindTheMinimumNumber{
	public static void main(String[] args){
		int[] a = {67,12,89,11,45,10,67,8,23,2,67,8};
		int min = a[0];

		for(int i=0; i<a.length; i++){
			if(a[i]<min){
				min = a[i];
			}
		}
		System.out.println(min);
}
}
