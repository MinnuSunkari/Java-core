package com.arraysdsa;

public class ArrayAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= {2,4,5,2,7};
        double avg;
        int sum=0;
        int n= arr.length;
        for(int i=0;i<arr.length;i++) {
        	sum=sum+arr[i];
        }
        avg=sum/n;
        System.out.println(avg);
	}

}
