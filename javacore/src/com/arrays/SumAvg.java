package com.arrays;
import java.util.*;
public class SumAvg {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the length n value :");
		int n = input.nextInt();
		int sum=0;
		float avg =0;
		int[] arr = new int[n];
		System.out.println("enter the array elements:");
		for(int i=0;i<n;i++) {
			arr[i] = input.nextInt();
		}
		for(int m=0;m<n;m++) {
			System.out.print(arr[m]);
		}
		//sum of array
		for(int j=0;j<n;j++) {
			sum=sum+arr[j];
		}
		 avg = (float)sum/n;//use float or double
		 System.out.println(" ");
		System.out.println("sum = " +sum);
		System.out.println("avg = "+avg);
		
       input.close();
	}

}
