package com.encapsulation;

public class Recharge {
    private long mobileNum;
    private String operatorName;
    private int  rechargeAmt;
    
 public long getmobileNum() {
	 return mobileNum;
 }
 public String getoperatorName() {
	 return operatorName;
 }
 public int getrechargeAmt() {
	 return rechargeAmt;
 }
 public void setmobileNum(long mobileNum) {
	 
		 this.mobileNum=mobileNum;
	 
 }
 public void setoperatorName(String operatorName) {
	 this.operatorName=operatorName;
 }
 public void setrechargeAmt(int rechargeAmt) {
	 if(rechargeAmt>=10) {
	 this.rechargeAmt=rechargeAmt;
	 }
	 else {
		 System.out.println("recharge amt atleast rs 10");
	 }
 }
    
}
