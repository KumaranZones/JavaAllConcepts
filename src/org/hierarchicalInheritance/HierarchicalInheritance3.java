package org.hierarchicalInheritance;

public class HierarchicalInheritance3 extends HierarchicalInheritance1{

	public void m3() {
		System.out.println("This is Child Class 2");
	}
	public static void main(String[] args) {
		HierarchicalInheritance3 h = new HierarchicalInheritance3();
		HierarchicalInheritance2 h1 = new HierarchicalInheritance2();
		h.m1();
		h1.m2();
		h.m3();
		
	}
}
