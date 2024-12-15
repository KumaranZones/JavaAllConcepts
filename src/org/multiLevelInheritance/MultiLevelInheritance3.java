package org.multiLevelInheritance;

public class MultiLevelInheritance3 extends MultiLevelInheritance2{

	public void m3() {
		System.out.println("This is Child Class property");
	}
	public static void main(String[] args) {
		MultiLevelInheritance3 m = new MultiLevelInheritance3();
		m.m1();
		m.m2();
		m.m3();
	}
}
