package org.handleTheExceptionss;

public class SingleTrySingleCatch {

	public static void main(String[] args) {
		try {
		int a = 10;
		int b = 0;
		
		System.out.println(a/b);
		}catch(ArithmeticException e) {
			System.err.println("Anything divided by zero undefined");
		}
	}
}