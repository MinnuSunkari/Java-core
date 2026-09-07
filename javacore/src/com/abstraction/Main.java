package com.abstraction;

public class Main{
	public static void main(String[] args) {
		Resturant p= new PizzaRes();
		p.name_Rest();
		p.order();
	    int n=p.price();
	    System.out.println(n);
	    int d=p.quntity();
	    System.out.println(d);
	    p.total_Price(n,d);
		
	}
}


