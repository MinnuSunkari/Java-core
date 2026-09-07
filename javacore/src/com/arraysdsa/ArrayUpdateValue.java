package com.arraysdsa;

public class ArrayUpdateValue {

	public static void main(String[] args) {
		int[] arr= {2,4,5,8};
		int[] a1=new int[arr.length];
		int pos =2;
		int val=9;
		for(int i=0;i<arr.length;i++) {
			if(i==pos) {
				a1[i]=val;
			}
			else {
				a1[i] =arr[i];
			}
		}
		
       for(int i=0;i<a1.length;i++) {
    	   System.out.print(a1[i]+" ");
       }
	}

}
