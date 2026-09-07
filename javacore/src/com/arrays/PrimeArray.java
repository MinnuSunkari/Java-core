package com.arrays;

public class PrimeArray {

	public static void main(String[] args) {
		int[] arr = {13, 4, 56, 32, 99, 11};
		for(int i=0;i<arr.length;i++) {
			boolean isprime = true;
			for(int j=2;j<=arr[i]/2;j++) {
				if(arr[i]%j==0) {
					isprime = false;
					break;
				}
			}
			if(isprime==true) {
				System.out.println(arr[i]);
			}
		}

	}

}
