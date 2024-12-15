package org.javaInterviewQuestion;

public class GivenNumberIsPrimeOrNot{
	public static void main(String[] args){
		int num = 13;
		int count = 0;
		if(num>0){
			for(int i=1; i<=num; i++){
				if(num%i==0){
					count++;
				}
			}
			if(count==2){
				System.out.println("This is a Prime Number");
			}else{
				System.out.println("This is Not a Prime Number");
			}
		}else{
			System.out.println("This Number is Less Than Zero");
		}
}
}
