package com.oops;

public class MobileDemo {
	static String brand = "Samsung";
	String  model;
	int price;
	String color;
	static{
		System.out.println("Mobile store opened");
	}
	{
		System.out.println("Mobile Object Created");
	}

	public static void main(String[] args) {
		
		MobileDemo mob1 = new MobileDemo();
		mob1.model = "Galaxy A55";
		mob1.price =35000;
		mob1.color="Black";
		MobileDemo mob2 = new MobileDemo();
		mob2.model = "Galaxy S24";
		mob2.price =75000;
		mob2.color="Blue";
		System.out.println("Mobile 1");
		System.out.println(mob1.model+"\n"+mob1.price+"\n"+mob1.color);
		System.out.println("Mobile 2");
		System.out.println(mob2.model+"\n"+mob2.price+"\n"+mob2.color);
		
		
         
	}

}
