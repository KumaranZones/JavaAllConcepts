package org.handleTheExceptionss;

public class SingleTryMultipleCatch {

	public static void main(String[] args) {
		
		//SingleTrySingleCatch - possiple
		//SingleTryMultipleCatch - possible
		//MultipleTrySingleCatch - Not possible
		//Single catch - Not possible
		//SingleTry - possible.But Exception will be not Handled
		//1Try1Catch1Finally - possible
		//Finally only - Not possible
		try {
			int a = 10;
			int b = 0;
			Thread.sleep(3000);
			String s ="Java";
			char ch = s.charAt(4);
			System.out.println(ch);
			System.out.println(a/b);
			}catch(ArithmeticException e) {
				System.err.println("Anything divided by zero undefined");
			}catch(StringIndexOutOfBoundsException e) {
				System.out.println("we ask out of Index value");
			}catch(InterruptedException e) {
				System.out.println("This is comipleTimeException");
			}catch(Exception e) {
				System.out.println("something went wroung");
			}
	}
}
