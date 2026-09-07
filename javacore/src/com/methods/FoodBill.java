package com.methods;
import java.util.*;
public class FoodBill {
	Scanner sc = new Scanner(System.in);
	int qua;
	double price;
	double bill;
	  static void display() {
		System.out.println("--------Menu--------");
		System.out.println("1.roti ------- 20rs");
		System.out.println("2.naan ------- 40rs");
		System.out.println("3.biryani ------- 220rs");
		System.out.println("4.ckn curry ------- 120rs");
		System.out.println("5.water botttle ------- 40rs");
	}
	  double bill(int qua,double price) {
	 System.out.println("enter your choice:");
	 int choice=sc.nextInt();
	 switch(choice){
	 case 1:
		 
		 System.out.println(" roti -------20rs");
		 price=20;
	     System.out.println("enter quantity:");
	        qua=sc.nextInt();
	        bill = qua*price;
	        break;
	 case 2: 
		 System.out.println(" naan -------40rs");
		 price = 40;
     System.out.println("enter quantity:");
     qua=sc.nextInt();
     bill=qua*price;
     break;
	 case 3:
		 System.out.println("biryani -------220rs");
		 price = 220;
     System.out.println("enter quantity:");
     qua=sc.nextInt();
     bill=qua*price;
     break;
	 case 4: System.out.println("ckn curry -------120rs");
     System.out.println("enter quantity:");
     price=120;
     qua=sc.nextInt();
     bill=qua*price;
     break;
	 case 5: System.out.println("water bottle -------40rs");
     System.out.println("enter quantity:");
     price=40;
     qua=sc.nextInt();
     bill=qua*price;
     break;
     default :
    	 System.out.println("enter valid choice");
	 }
	  return bill;
	
	  }
	  double dis(double bill) {
		  if(bill>1000) {
			  bill=bill-(bill*0.10);
		  }else {
			  System.out.println("no discount");
		  }
		  return bill;
		  
	  }
       void printBill(double bill) {
    	   System.out.println("total bill:"+bill);
       }
	public static void main(String[] args) {
	 FoodBill b =new FoodBill();
	 display();

     double total = b.bill(0, 0);
     double finalBill = b.dis(total);
     b.printBill(finalBill);
	 
	}

}
