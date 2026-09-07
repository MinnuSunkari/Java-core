package com.arrays;

public class CopyArray {

	public static void main(String[] args) {
		int[] arr1= {2,4,5,6,7};
		int n = arr1.length;
		int[] arr2= new int[n];
		for(int i=0;i<n;i++) {
			arr2[i]=arr1[i];
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr1[i]);
			
		}
		System.out.println(" ");
		for(int i=0;i<n;i++) {
			System.out.print(arr2[i]);
		}

	}

}
