package org.polymorphism;

public class MethodOverLoading {

	public void methodOverLoad() {
		System.out.println("This is Non-Parameterized Method");
	}

	public void methodOverLoad(int a) {
		System.out.println(a);
	}

	public void methodOverLoad(int a,int b) {
		System.out.println(a+b);
	}

	public void methodOverLoad(int a,int b,int c) {
		System.out.println(a+b+c);
	}

	public void methodOverLoad(int a,int b,int c,int d) {
		System.out.println(a+b+c+d);
	}

	public void methodOverLoad(int a,int b,int c,int d,int e) {
		System.out.println(a+b+c+d+e);
	}
	public static void main(String[] args) {
		MethodOverLoading m = new MethodOverLoading();
		m.methodOverLoad();
		m.methodOverLoad(10);
		m.methodOverLoad(10,20);
		m.methodOverLoad(10,20,30);
		m.methodOverLoad(10,20,30,40);
		m.methodOverLoad(10,20,30,40,50);
	}
}
