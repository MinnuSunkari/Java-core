package com.oops;

public class Laptop {
      String brand;
      String model;
      int price;
      public Laptop(String brand,String model,int price) {
    	  this.brand=brand;
    	  this.model=model;
    	  this.price=price;
      }
      public Laptop(Laptop l) {
    	  this.brand=l.brand;
    	  this.model=l.model;
    	  this.price=l.price;
      }
      public void display() {
    	  System.out.println("brand:"+brand);
    	  System.out.println("model:"+model);
    	  System.out.println("price:"+price);
      }
      
	public static void main(String[] args) {
		Laptop l=new Laptop("dell","inspiron 15",62000);
		Laptop l1 = new Laptop(l);
		l.display();
		System.out.println(" ");
		l1.display();

	}

}
