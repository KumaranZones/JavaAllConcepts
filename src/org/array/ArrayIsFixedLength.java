package org.array;

public class ArrayIsFixedLength{
	public static void main(String[] args){
		int[] a = {12,23,34,45,56,67,78,89};

		System.out.println("Array is fixed length.So If we ask Out of index,It will return the OutOfBoundException");
		
		System.out.println(a[10]);
}
}

