package org.keywords;

public class StaticKeyWord {

	//It is used to two level : Method Level and Variable Level
	//we can't use for class Level,because class for no memory
	static int a = 100;
	
	public static void m1() {
		System.out.println("This is static method");
		System.out.println(a);
	}
	public static void main(String[] args) {
		
		m1();
	}
}
