package org.handleTheExceptionss;

public class ThrowKeyWord {

	public static void main(String[] args) {
		try {
		int a = 10;
		int b = 0;
		
		System.out.println(a/b);
		}catch(ArithmeticException e) {
			throw new NullPointerException("something went wroung");
		}
		
	}
}
