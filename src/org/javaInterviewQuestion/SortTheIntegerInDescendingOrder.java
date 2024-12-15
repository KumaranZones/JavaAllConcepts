package org.javaInterviewQuestion;

public class SortTheIntegerInDescendingOrder{
	public static void main(String[] args){
		int[] a = {67,12,89,11,45,10,67,8,23,2,67,8};
		
		int temp;

		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i]<a[j]){
					temp = a[i];
					a[i]  = a[j];
					a[j] = temp;
				}
			}
		}
		for(int aa : a){
			System.out.print(aa+",");
		}
}
}
