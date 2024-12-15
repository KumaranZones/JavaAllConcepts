package org.singleInheritance;

public class SingleInheritance2 extends SingleInheritance1{

	public void m2() {
		System.out.println("This is ChildClass Property");
	}
	public static void main(String[] args) {
		SingleInheritance2 s = new SingleInheritance2();
		s.m1();
		s.m2();
	}
}
