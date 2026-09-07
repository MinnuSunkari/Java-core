package com.encapsulation;

public class Order {
	private int orderid;
	private String cname;
	private int totalAmount;
	private String orderstus;
public int getorderid(){
	return orderid;
}
public String getcname() {
	return cname;
}
public int gettotalAmount() {
	return totalAmount;
}
public String getorderstus() {
	return orderstus;
}
public void setorderid(int orderid){
	this.orderid = orderid;
}
public void setcname(String cname) {
	this.cname=cname;
}
public void settotalAmount(int totalAmount) {
	this.totalAmount=totalAmount;
}
public void setorderstus(String orderstus) {
	if(orderstus.equals("Pending") || orderstus.equals("Preparing") ||
			orderstus.equals("Delivered") || orderstus.equals("Cancelled")) {
		this.orderstus=orderstus;
	}else {
		System.out.println("Invalid");
	}
}
}
