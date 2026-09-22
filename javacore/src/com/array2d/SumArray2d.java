package com.array2d;
import java.util.*;
public class SumArray2d {

	public static void main(String[] args) {
      int[][] arr= {{1,2,3},{4,5,6},{1,2,1}};
      int[][] arr2= {{2,3,1},{1,2,1},{2,2,2}};
      int[][] sum= new int[arr.length][arr[0].length];
      int l=arr.length;
      int k=arr2.length;
      for(int i=0;i<arr.length;i++) {
    	  for(int j=0;j<arr.length;j++) {
    		  sum[i][j]=arr[i][j]+arr2[i][j];
    	  }
      }
      for(int i=0;i<arr.length;i++) {
    	  for(int j=0;j<arr[0].length;j++) {
    		  System.out.print(sum[i][j]+" ");
    	  }
    	  System.out.println(" ");
      }

	}

}
