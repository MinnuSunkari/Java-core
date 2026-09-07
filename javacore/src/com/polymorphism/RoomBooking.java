package com.polymorphism;

public class RoomBooking {
	String cname;
	String room_type;
	int stay_days;
	
public RoomBooking(String cname) {
	this.cname=cname;
}
public RoomBooking(String cname,String room_type) {
this(cname);
this.room_type=room_type;
}
public RoomBooking(String cname,String room_type,int stay_days) {
	this(cname,room_type);
	this.stay_days=stay_days;
}
public void displayBooking() {
	System.out.println("Customer name :"+cname);
	System.out.println("Roomtype:"+room_type);
	System.out.println("Stay days:"+stay_days);
}
public int calculateBill(int stay_days) {
return 1000*stay_days;}
public int calculateBill(int stay_days,String room_type) {
	if(room_type.equals("Luxury")) {
		return 2000*stay_days;
	}
	return 1000*stay_days;
}
public double calculateBill(int stay_days,String room_type,double dis) {
	if(room_type.equals("Luxury")) {
	     System.out.println("discount applicable");
	      dis=dis/100;
		return (2000*stay_days)-((2000*stay_days)*(dis));
	}
	return 1000*stay_days;
}
}
