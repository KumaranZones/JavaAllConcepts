package org.array;

public class OneDimentionalArray{
	public static void main(String[] args){
		int[] a = {23,34,45,56,67,78,89,12};

		System.out.println("Total Length : "+a.length);

		System.out.println("Total Index  : "+(a.length-1));

		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}

		for(int i=a.length-1; i>=0; i--){
			System.out.println(a[i]);
		}

		for(int aa : a){
			System.out.print(aa+",");
		}
}
}
