package com.polymorphism;

public class RoomBookingMain {

	public static void main(String[] args) {
		RoomBooking r=new RoomBooking("minnu","luxury",2);
		r.displayBooking();
		System.out.println("total:"+r.calculateBill(2,"Luxury"));
		System.out.println("total with dis :"+r.calculateBill(2,"Luxury",50.0));
		

	}

}
