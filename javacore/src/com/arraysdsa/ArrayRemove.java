package com.arraysdsa;

public class ArrayRemove {

	public static void main(String[] args) {
		int a[] = {2,4,6,7};
		int a1[] =new int[a.length-1];
		int pos=3;
		for(int i=0;i<pos;i++) {
		     a1[i] =a[i];
		}
		for(int i=pos;i<a1.length;i++) {
			a1[i]=a[i+1]; 
		}
         for(int i=0;i<a1.length;i++) {
        	 System.out.print(a1[i]+" ");
         }
	}
}


	


