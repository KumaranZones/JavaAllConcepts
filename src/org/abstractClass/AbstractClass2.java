package org.abstractClass;

public class AbstractClass2 extends AbstractClass{

	@Override
	public void abstractMethod() {
		System.out.println("This is abstract method");
	}
	public AbstractClass2() {
		super(10);
		System.out.println("This is Child Class Non-Parameterized Constructor");
	}
	public AbstractClass2(int a) {
		super();
		System.out.println("This is Child Class Parameterized Constructor");
	}
	public static void main(String[] args) {
		AbstractClass2 a = new AbstractClass2();
		AbstractClass2 a1 = new AbstractClass2(10);
		a.instanceMethod();
		staticMethod();
		a.abstractMethod();
	}

	
}
