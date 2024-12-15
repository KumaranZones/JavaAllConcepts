package org.conditionalStatements;

public class SwitchStatement{
	public static void main(String[] args){
		int a = 90;
	switch(a){
		case 100:
			System.out.println("S Grade");
			break;
		case 90:
			System.out.println("A Grade");
			break;
		case 80:
			System.out.println("B Grade");
			break;
		case 70:
			System.out.println("C Grade");
			break;
		case 60:
			System.out.println("D Grade");
			break;
		case 50:
			System.out.println("E Grade");
			break;
		case 40:
			System.out.println("F Grade");
			break;
		case 35:
			System.out.println("Just Pass");
			break;
		default:
			System.out.println("Fail");

	}
}
}
