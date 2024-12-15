package org.variables;

public class Variables {

	//Variables 3 types
	//class variable-Inside the class outside the method
	//static variable-Inside the class outside the method
	//local variable-Inside the method only
	int a = 10;  //class variable
	static int b = 20;   //static variable
	public void m1() {
		int a = 30;    //local variable
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		Variables v = new Variables();
		v.m1();
	}
}
