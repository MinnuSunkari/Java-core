package com.loops;
import java.util.*;
public class NumtoBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner input = new Scanner(System.in);
   System.out.println("enter the number to convert binary:");
   int num = input.nextInt();
   String res = " ";
   while(num>0) {
	   int rem = num%2;
	   res=rem+res;
	   num=num/2;
   }
   System.out.println(res);
	}

}
