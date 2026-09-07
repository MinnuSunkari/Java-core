package com.arrays;

public class NumSequnece {

	public static void main(String[] args) {
		int[] arr= new int[50];
		int num =1;
		arr[0]=1;
		for(int i=0;i<arr.length-1;i++) {
			
			arr[i+1]=arr[i]+num;
			num=num+2;
			}
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		}
	}

}
