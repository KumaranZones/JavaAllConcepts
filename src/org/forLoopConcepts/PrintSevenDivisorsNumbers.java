package org.forLoopConcepts;

public class PrintSevenDivisorsNumbers{
	public static void main(String[] args){
		for(int i=200; i<=250; i++){
			if(i%7==0){
				System.out.println(i);
			}
		}
	}
}