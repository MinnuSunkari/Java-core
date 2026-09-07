package com.oops;

public class FoodOrder {
	int orderid;
	String Rname;
	String Fooditem;
	String dadd;
	 static {
		 System.out.println("food order started");
	 }
	public FoodOrder(int orderid) {
		this.orderid=orderid;
		System.out.println("order id:"+orderid);
	}
	public FoodOrder(int orderid,String Rname) {
		this(orderid);
		this.Rname=Rname;
		System.out.println("Rname:"+Rname);
		
	}
	public FoodOrder(int orderid,String Rname,String Fooditem) {
		this(orderid,Rname);
		this.Fooditem=Fooditem;
		System.out.println("fooditem:"+Fooditem);
		
	}
	public FoodOrder(int orderid,String Rname,String Fooditem,String dadd) {
		this(orderid,Rname,Fooditem);
		this.dadd=dadd;
		System.out.println("add:"+dadd);
		
	}
	

	public static void main(String[] args) {
	FoodOrder f=new FoodOrder(101,"pista house"," biryani","2nd floor codegnan hawai store");
	}

}
