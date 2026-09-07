package com.encapsulation;

public class RechargeAmt {

	public static void main(String[] args) {
		Recharge r= new Recharge();
		r.setmobileNum(9876543);
		r.setoperatorName("lipika");
		r.setrechargeAmt(56);
  System.out.println(r.getmobileNum());
  System.out.println(r.getoperatorName());
  System.out.println(r.getrechargeAmt());
	
	}

}
