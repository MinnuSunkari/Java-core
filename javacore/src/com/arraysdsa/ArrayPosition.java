package com.arraysdsa;

public class ArrayPosition {

	public static void main(String[] args) {
		int a[] = {2,4,6,7};
		int a1[] =new int[a.length+1];
		int pos=2;
		int value=15;
		for(int i=0;i<pos;i++) {
		     a1[i] =a[i];
		}
		a1[pos]=value;
		for(int i=pos;i<a.length;i++) {
			a1[i+1]=a[i]; 
		}
         for(int i=0;i<a1.length;i++) {
        	 System.out.print(a1[i]+" ");
         }
	}

}
