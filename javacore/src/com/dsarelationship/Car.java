package com.dsarelationship;
class Vechicle{
	public void m() {
		System.out.println("start vechicle");
		}
}
 class Engine{
	public void m1() {
		System.out.println("engine on");
	}
}

public class Car extends Vechicle {

	static Engine e= new Engine();
	public void m3() {
		e.m1();
		System.out.println("car started");
	}

	public static void main(String[] args) {
		
		Car c=new Car();
		c.m();
		c.m3();
		

	}

}
