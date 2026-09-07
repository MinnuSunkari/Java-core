package com.encapsulation;

public class CarM {

	public static void main(String[] args) {
		Car c=new Car();
		c.setModel("Camry");
		c.setYear(2020);		
		System.out.println("Model :"+c.getModel());
		System.out.println("Year :"+c.getYear());

	}

}
