package org.interfacess;

public class Interface3 implements Interface1,Interface2{

	public void interfaceMethod5() {
		System.out.println("This is Interface Method 5");
	}

	public void interfaceMethod6() {
		System.out.println("This is Interface Method 6");
	}

	public void interfaceMethod7() {
		System.out.println("This is Interface Method 7");
	}

	public void interfaceMethod8() {
		System.out.println("This is Interface Method 8");
	}

	public void interfaceMethod1() {
		System.out.println("This is Interface Method 1");
	}

	public void interfaceMethod2() {
		System.out.println("This is Interface Method 2");
	}

	public void interfaceMethod3() {
		System.out.println("This is Interface Method 3");
	}

	public void interfaceMethod4() {
		System.out.println("This is Interface Method 4");
	}

	public static void main(String[] args) {
		Interface3 i = new Interface3();
		i.interfaceMethod1();
		i.interfaceMethod2();
		i.interfaceMethod3();
		i.interfaceMethod4();
		i.interfaceMethod5();
		i.interfaceMethod6();
		i.interfaceMethod7();
		i.interfaceMethod8();
	}
	
}
