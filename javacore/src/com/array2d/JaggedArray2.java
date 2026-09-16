package com.array2d;
import java.util.*;
public class JaggedArray2 {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		    System.out.println("enter the row number:");
		    int n= sc.nextInt();
	        int[][] arr=new int[n][];
	        for(int i=0;i<arr.length;i++){
	            System.out.println("enter the col number:");
	            int col=sc.nextInt();
	            arr[i]=new int[col];
	            for(int j=0;j<col;j++){
	                System.out.println("enter the array element:");
	                arr[i][j]=sc.nextInt();
	                
	            }
	        }
	        System.out.println("the array:");
	        for(int i=0;i<arr.length;i++){
	            for(int j=0;j<arr[i].length;j++){
	                System.out.print(arr[i][j]+" ");
	            }
	            System.out.println(" ");
	        }

	}

}
