package com.arrays;

public class SumofEvenpos {

	public static void main(String[] args) {
		int[] arr = {2,3,4,5,6,7};
		int sum=0;
		int odd=0;
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				sum=sum+arr[i];
			}
			else {
				odd = odd+arr[i];
			}
		}
		System.out.println("sum of the array:"+sum);//2+4+6
		System.out.println("sum of the array:"+odd);//15

	}

}
