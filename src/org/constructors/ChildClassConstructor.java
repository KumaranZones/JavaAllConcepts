package org.constructors;

public class ChildClassConstructor extends ParentClassConstructor{

	public ChildClassConstructor() {
		super();
		System.out.println("This is Child class Non-Paremeterized Constructor");
	}
	public ChildClassConstructor(int a) {
		super(10);
		System.out.println("This is Child class Paremeterized Constructor");
	}
	public static void main(String[] args) {
		ChildClassConstructor c = new ChildClassConstructor();
		ChildClassConstructor c1 = new ChildClassConstructor(10);
	}
	
}
