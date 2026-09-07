package com.arrays;

public class ElePresentOrNot {

	public static void main(String[] args) {
     int[] arr = {2,1,4,9,6,5};
     int ele = 9;
     boolean flag = false;
     for(int i=0;i<arr.length;i++){
    	 if(arr[i]==ele) {
    		 flag=true;
    		 break;
    	 }
    	 
     }
     if(flag==true) {
    	 System.out.println("found");
     }
     else {
    	 System.out.println("not found");
     }

	}

}
