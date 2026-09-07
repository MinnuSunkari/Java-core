package com.javabasic;
import java.math.BigInteger;
import java.util.*;
public class EmpDts {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	 int empid=0;
	 String name = "";
	 String full_name="";
	 double salary=0;
	 String address="";
	 int atm_pin=0;
	 long anu_salary=0;
	 int inc=0;
	 double height_emp=0.0;
	 BigInteger phn_num=BigInteger.ZERO;
	 BigInteger ad_num=BigInteger.ZERO;
	 
	 System.out.println("enter the empid:");
	 if(sc.hasNextInt()) {
		 empid=sc.nextInt();
		 System.out.println("empid:"+empid);
	 }else {
		 System.out.println("empid is invalid");
		 return;
	 }
	 System.out.println("enter the emp name:");
	 if(sc.hasNext()) {
		  name = sc.next();
		  System.out.println("emp name:"+name);
	 }else {
		 System.out.println("emp name is invalid");
	 }
	 

	}

}
