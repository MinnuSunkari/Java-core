package com.arraysdsa;

public class MovingZeroEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int[] arr= {1,0,2,0,12};
          int index=0;
          for(int i=0;i<arr.length;i++) {
        	  if(arr[i]!=0) {
        		  arr[index]=arr[i];
        		  index++;
        	  }
          }
          while(index<arr.length) {
        	  
          }
	}

}
