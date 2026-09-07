package com.arraysdsa;

public class ArrayMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,7,3,1,9};
		int max=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
        System.out.println(max);
	}

}
