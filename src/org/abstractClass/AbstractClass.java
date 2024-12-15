package org.abstractClass;

public abstract class AbstractClass {

	{
		System.out.println("This is Instance Block");
		System.out.println("When the constructor is triggered then only the Instance will be Executed automatically");
	}
	static {
		System.out.println("This is static Block");
	}
	public void instanceMethod() {
		System.out.println("This is Normal Instance method");
	}
	public static void staticMethod() {
		System.out.println("This is static method");
	}
	public AbstractClass() {
		System.out.println("This is Super Class non-Parameterized Constructor");
	}
	public AbstractClass(int a) {
		System.out.println("This is Super Class Parameterized Constructor");
	}
	public abstract void abstractMethod();
		
	
}
