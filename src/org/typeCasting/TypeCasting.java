package org.typeCasting;

public class TypeCasting {

	public static void byteToInteger() {
		byte a = 120;
		int b = (int)a;
		System.out.println(b);
	}
	public static void byteToShort() {
		byte a = 121;
		short b = (short)a;
		System.out.println(b);
	}
	public static void byteToLong() {
		byte a = 102;
		long b = (long)a;
		System.out.println(b);
	}
	public static void byteToFloat(){
		byte a = 98;
		float b = (float)a;
		System.out.println(b);
	}
	public static void byteToDouble(){
		byte a = 98;
		double b = (double)a;
		System.out.println(b);
	}
	public static void integerToByte() {
		int a = 100;
		byte b = (byte)a;
		System.out.println(b);
	}
	public static void integerToShort() {
		int a = 98765;
		short b = (short)a;
		System.out.println(b);
	}
	public static void integerToDouble() {
		int a = 2345678;
		double d = (double)a;
		System.out.println(d);
	}
	public static void integerToFloat() {
		int a = 2345678;
		float d = (float)a;
		System.out.println(d);
	}
	public static void shortToInteger() {
		short a = 23456;
		int d = (int)a;
		System.out.println(d);
	}
	public static void shortToFloat() {
		short a = 23456;
		float d = (float)a;
		System.out.println(d);
	}
	public static void shortToDouble() {
		short a = 23456;
		double d = (double)a;
		System.out.println(d);
	}
	public static void shortToByte() {
		short a = 23;
		byte d = (byte)a;
		System.out.println(d);
	}
	public static void floatToByte() {
		float a = 46.0f;
		byte d = (byte)a;
		System.out.println(d);
	}
	public static void floatToInteger() {
		float a = 46234566.0f;
		int d = (int)a;
		System.out.println(d);
	}
	public static void floatToShort() {
		float a = 87777.0f;
		short d = (short)a;
		System.out.println(d);
	}
	public static void floatToDouble() {
		float a = 88888888.0f;
		double d = (double)a;
		System.out.println(d);
	}
	public static void main(String[] args) {
		
		byteToShort();
		byteToInteger();
		byteToLong();
		byteToFloat();
		byteToDouble();
		integerToByte();
		integerToShort();
		integerToFloat();
		integerToDouble();
		shortToByte();
		shortToInteger();
		shortToFloat();
		shortToDouble();
		floatToByte();
		floatToShort();
		floatToInteger();
		floatToDouble();
	}
}
