package com.oops;

public class Patient {
	int patid;
	String patname;
	String dis;
	double bill;
	static {
		System.out.println("patient registration started");
	}
	public Patient(int patid) {
		this.patid=patid;
		System.out.println("patient id:"+patid);
	}
	public Patient(int patid,String patname) {
		this(patid);
		this.patname=patname;
		System.out.println("patient name:"+patname);
	}
	public Patient(int patid,String patname,String dis) {
		this(patid,patname);
		this.dis=dis;
		System.out.println("patient disease:"+dis);
	}
	public Patient(int patid,String patname,String dis,double bill) {
		this(patid,patname,dis);
		this.bill=bill;
		System.out.println("total bill:"+bill);
	}
	

	public static void main(String[] args) {
		Patient p1=new Patient(101,"ram","fever",10000);

	}

}
