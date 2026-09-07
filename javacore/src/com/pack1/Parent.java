package com.pack1;
class GrandP{
	  void gm1() {
		System.out.println("gm1");
	}
	
}
 public class Parent  {
	public void m1() {
		System.out.println("pm1");
	}
	public static void main(String[] args) {
		Parent p= new Parent();
		GrandP g= new GrandP();
		g.gm1();
	}
	}
 