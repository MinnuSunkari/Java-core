package com.methods;

public class Atm {
	static double bal = 20000;
	 static void checkBalance() {
		System.out.println(bal);
	}
	 public double deposit(double amt) {
		 bal=bal+amt;
		 return bal;
	 }
	public double withdraw(double mon) {
		if(mon>bal) {
			System.out.println("avil balance:");
			return bal;
		}else {
		bal=bal-mon;
		return bal;}
	}
	void displayMenu() {
		System.out.println(bal);
	}

	public static void main(String[] args) {
		 Atm a = new Atm();
		checkBalance();
		double m= a.deposit(500);
		System.out.println(m);
		a.displayMenu();
		System.out.println(a.withdraw(1000));
	}

}
