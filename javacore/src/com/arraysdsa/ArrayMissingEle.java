package com.arraysdsa;

public class ArrayMissingEle {

	public static void main(String[] args) {
	int[] arr= {4,0,6,7};
	
	int len=0;
	int sum=0;
	for(int i=1;i<=arr.length;i++) {
		len=len+i;
	}
	for(int i=0;i<arr.length;i++) {
		sum=sum+arr[i];//4
	}
	int missing =len-sum;//17-6
	System.out.println(missing);

	}

}
