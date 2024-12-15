package org.methodChaining;

public class MethodChaining {

	public Window manage() {
		return new Window();
	}
	public static void main(String[] args) {
		MethodChaining driver = new MethodChaining();
		driver.manage().window().maximize();
	}
}
