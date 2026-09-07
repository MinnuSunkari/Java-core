package com.recursion;

public class Prime {
	static boolean prime(int n,int divn) {
		if(n==divn) {
			return true;
		}
		if(n%divn==0) {
			return false;
		}
		return prime(n,divn+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean r= prime(10,2);
		if(r) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}

	}

}
