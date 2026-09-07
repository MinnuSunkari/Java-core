package com.encapsulation;

public class Bank {
	private  int amt;
	
public int getAmt() {
	return amt;
}
public void setAmt(int amt) {
	if(amt>0) {
	  this.amt=amt;	
	}
	else {
		System.out.println("Invalid amt");
	}
}
}
