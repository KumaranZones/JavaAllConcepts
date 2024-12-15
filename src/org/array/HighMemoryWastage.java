package org.array;

public class HighMemoryWastage{
	public static void main(String[] args){
		int a[] = new int[10];

		a[0]=10;
		a[1]=20;

		System.out.println("Total Length : "+a.length);

		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
		
	}
}

