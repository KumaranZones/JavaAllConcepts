package org.controlStatements;

public class IfElseIfLadder{
	public static void main(String[] args){
		int mark =35;
		if(mark<=100 && mark>90){
			System.out.println("S Grade");
		}else if(mark<89 && mark>80){
			System.out.println("A Grade");
		}else if(mark<79 && mark>70){
			System.out.println("B Grade");
		}else if(mark<69 && mark>60){
			System.out.println("C Grade");
		}else if(mark<59 && mark>50){
			System.out.println("D Grade");
		}else if(mark<49 && mark>=35){
			System.out.println("E Grade");
		}else{
			System.out.println("Fail");
		}
	}
}
