package com.oops;

public class Product {
	int orid;
	String orname;
	double orprice;
	
public Product(int orid) {
	this.orid=orid;
	System.out.println("order is created \noid:"+orid);
	
}
public Product(int orid,String orname) {
	this(orid);
	this.orname=orname;
	System.out.println("order name:"+orname);
	
}
public Product(int orid,String orname,double orprice) {
	this(orid,orname);
	this.orprice=orprice;
	System.out.println("order price:"+orprice);
}

	public static void main(String[] args) {
		Product p= new Product(101,"laptop",30000.00);
		

	}

}
