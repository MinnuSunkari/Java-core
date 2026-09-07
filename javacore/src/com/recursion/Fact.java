package com.recursion;

public class Fact {
 int fact(int n) {
	if(n==1) {
		return 1;
	}
	return n*fact(n-1);
}
	public static void main(String[] args) {
		Fact f= new Fact();
		int res= f.fact(7);
		System.out.println(res);	

	}

}
