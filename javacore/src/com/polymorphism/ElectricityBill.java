package com.polymorphism;

public class ElectricityBill {
	
public int calculateBill(int units) {
	return 8*units;
}
public double calculateBill(int units,double serviceCharge) {
	return (8*units)+serviceCharge;
}
public double calculateBill(int units,double serviceCharge,double tax) {
	double amt=(8*units)+serviceCharge;
	return amt-(((8*units)+serviceCharge)*(tax/100));
}

}
