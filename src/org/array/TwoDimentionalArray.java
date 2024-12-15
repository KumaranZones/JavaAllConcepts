package org.array;

public class TwoDimentionalArray{
	public static void main(String[] args){
		int [][] a = {{11,22,33,44,55,66,77,88,99},
				{12,23,34,45,56,67,78},
				{98,87,76,65,54,43,32},
				{13,24,35,47,58},
				{74,83,28,39,46,15,47,39},
				{77,33,44,77,88,33},
				{13,24,35,47,57},
				{10,29,38,48,58,67,22}
				};

		System.out.println("Total length : "+a[6].length);
		System.out.println(a.length);

		for(int i=0; i<a.length; i++){
			System.out.println(a[i].length);
		}

		for(int aa[] : a){
			for(int bb : aa){
				System.out.print(bb+"|");
			}
			System.out.println();
		}

		
}
}

