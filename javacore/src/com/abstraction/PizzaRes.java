package com.abstraction;

public class PizzaRes extends Resturant{
	void name_Rest() {
		System.out.println(" Pizza Hut");
	}
	 void order() {
		 System.out.println("veg pizza");
	 };
    int price() {
    	System.out.println("price of pizz:");
    	int price=120;
    	return price;
    }
    int  quntity() {
    	int q=2;
         return q;
    }@Override
    void total_Price(int price,int q) {
    	double tp=price*q;
    	System.out.println(tp);
    	
    }	
}


