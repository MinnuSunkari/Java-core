package com.arrays;
import java.util.*;
public class SecondLargeElement {

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     
	     System.out.println("enter the n value:");
	     int n= sc.nextInt();
	     int[] arr = new int[n];
	     System.out.println("enter the array elements:");
	     for(int i=0;i<n;i++) {
	    	 arr[i]= sc.nextInt();
	     }
	     System.out.println("the array elements :");
	     for(int i=0;i<n;i++) {
	    	 System.out.print(arr[i]+" ");
	     }
	     // finding second largest element
	     int largest = -1;//Integer.MIN_VALUE
	     int second_large = -1;//Integer.MIN_VALUE
	     for(int i=0;i<n;i++) {
	    	 if(arr[i]>largest) {
	    		 second_large = largest;
	    		 largest = arr[i];
	    	 }
	    	 else if(arr[i]>second_large && arr[i]!=largest) {
	    		 second_large = arr[i];
	    	 }
	     }
	     System.out.println("");
	     System.out.println(second_large);
	     sc.close();
	     

	}

}
