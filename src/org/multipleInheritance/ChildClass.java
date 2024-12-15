package org.multipleInheritance;

public class ChildClass implements ParentClass1,ParentClass2,ParentClass3{

	public void parentClassMethod1() {
		System.out.println("This is ParentClassMethod1");
	}
	public void parentClassMethod2() {
		System.out.println("This is ParentClassMethod2");
	}
	public void parentClassMethod3() {
		System.out.println("This is ParentClassMethod3");
	}
	public void childClassMethod() {
		System.out.println("This is Child Class Method");
	}
	public static void main(String[] args) {
		ChildClass c = new ChildClass();
		c.parentClassMethod1();
		c.parentClassMethod2();
		c.parentClassMethod3();
		c.childClassMethod();
	}
	

}
