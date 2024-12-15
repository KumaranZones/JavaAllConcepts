package org.javaInterviewQuestion;

public class FindTheMissingNumber{
	public static void main(String[] args){
		int[] a = {20,21,22,23,25};

		int sum1 = 0;
		for(int i=0; i<a.length; i++){
			sum1 = sum1+a[i];
		}
		int sum2 = 0;
		for(int i=20; i<=25; i++){
			sum2 = sum2+i;
		}
		int sum = sum2-sum1;
		System.out.println("Missing Number is = "+sum);
}
}

