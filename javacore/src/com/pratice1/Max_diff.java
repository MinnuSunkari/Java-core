package com.pratice1;
import java.util.Scanner;
import java.util.*;

public class Max_diff {
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the n value for array length");
	int n= sc.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<n;i++) {
		arr[i] = sc.nextInt();
	}
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}
	int max = Integer.MIN_VALUE;
	
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			int maxd = arr[i]-arr[j];
			if(max<maxd) {
				max=maxd;
			}
		}
	}
	
	System.out.println("the difference:"+max);
		

	}

}
