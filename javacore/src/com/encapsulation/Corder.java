package com.encapsulation;

public class Corder {

	public static void main(String[] args) {
		Order o = new Order();
		o.setorderid(101);
		o.setcname("minnu");
		o.settotalAmount(200);
		o.setorderstus("Pending");
		System.out.println(o.getorderid());
		System.out.println(o.getcname());
		System.out.println(o.gettotalAmount());
		System.out.println(o.getorderstus());
		
	}

}