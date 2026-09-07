package com.constructors;
class Parent{
	
	public Parent() {
		this(45);
		System.out.println("parent constructor");	}

	public Parent(int age) {
		this.m1();
		System.out.println("age of parent con"+age);
	}
	public void m1() {
		System.out.println("parent class method 1");
	}
	
}


public class ChildCon extends Parent {
	public ChildCon() {
		this.m2();
		System.out.println("child con");
		
	}
	public void m2() {
		System.out.println("child method");
	}

	public static void main(String[] args) {
		ChildCon c= new ChildCon();
		

	}

}
