package org.forLoopConcepts;

public class PrintTheOddNumberInGivenArray {

	public static void main(String[] args) {
		int[] a = {67,12,89,11,45,10,67,8,23,2,67,8};
		
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
	}
}
