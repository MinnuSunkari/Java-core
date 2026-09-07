package com.loops;
import java.util.*;
public class Fabiseries {

	public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("enter n value :");
      int n= input.nextInt();
      int a=0,b=1;
      
      for(int i=1;i<=n;i++) {
    	  System.out.println(a + " ");
    	  int c=a+b;
    	  a=b;
    	  b=c;
    	  
    	 
      }
     
     
      }

	}

