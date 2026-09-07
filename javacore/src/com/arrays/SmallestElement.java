package com.arrays;

import java.util.Scanner;

public class SmallestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mini =0;
		System.out.println("enter the n value:");
		int n= sc.nextInt();
		int[] arr = new int[n];
		System.out.println("enter the array elements:");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			mini = arr[0];
			if(arr[i]<arr[0]) {
				mini = arr[i];
			}
			else {
				mini = arr[0];
			}
		}
		System.out.println(mini);
		sc.close();


	}

}
