package org.addSubMulDiv;

public class AddSubMulDiv{
	public static int add(int a,int b){
		return (a+b);
	}
	public static int sub(int a,int b){
		return (a-b);
	}
	public static int mul(int a,int b){
		return (a*b);
	}
	public static int div(int a,int b){
		return (a/b);
	}
	public static void main(String[] args){
		int addValue = add(10,20);
		int subValue = sub(20,10);
		int mulValue = mul(10,2);
		int divValue = div(10,2);

		System.out.println(addValue);
		System.out.println(subValue);
		System.out.println(mulValue);
		System.out.println(divValue);

	}
}
