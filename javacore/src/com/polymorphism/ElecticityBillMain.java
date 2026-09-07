package com.polymorphism;

public class ElecticityBillMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricityBill e= new ElectricityBill();
		System.out.println(e.calculateBill(10));
		System.out.println(e.calculateBill(10,20));
		System.out.println(e.calculateBill(10,20,10));

	}

}
