package org.stringMethods;

public class StringMethods{
	public static void main(String[] args){
		String s = "Java";
		String s1 = "Selenium";

		int len = s.length();
		System.out.println(len);

		boolean eq = s.equals(s1);
		System.out.println(eq);

		boolean eqI = s.equalsIgnoreCase(s1);
		System.out.println(eqI);

		String up = s.toUpperCase();
		System.out.println(up);

		String low = s1.toLowerCase();
		System.out.println(low);

		boolean st = s.startsWith("J");
		System.out.println(st);

		boolean ends = s1.endsWith("m");
		System.out.println(ends);

		boolean con = s.contains("av");
		System.out.println(con);

		String concat = s1.concat(s);
		System.out.println(concat);

		int index = s.indexOf("a");
		System.out.println(index);

		int lastI = s1.lastIndexOf("e");
		System.out.println(lastI);

		char ch = s1.charAt(6);
		System.out.println(ch);

		String re = s.replace("Java","Maven");
		System.out.println(re);

		String rep = s1.replaceAll("Selenium","DataDriven");
		System.out.println(rep);

		String sub = s1.substring(3);
		System.out.println(sub);

		String[] split = s1.split("e");
		System.out.println(split);

		String s2 = "    trim    ";
		String trim = s2.trim();
		System.out.println(trim);

		boolean is = s2.isEmpty();
		System.out.println(is);

		String s3 = "-";
		String[] s4 = {"Java","Selenium","Maven","DataDriven"};

		String join = String.join(s3,s4);
		System.out.println(join);

		int a = 12345;
		String value = String.valueOf(a);
		System.out.println(value);

		String s5 = "12345";

		int parse = Integer.parseInt(s5);
		System.out.println(parse);


}
}
