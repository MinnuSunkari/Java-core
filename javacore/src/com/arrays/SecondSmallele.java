package com.arrays;

public class SecondSmallele {

	public static void main(String[] args) {
		int[] a = {5,6,7,8};
		int small = Integer.MAX_VALUE;
		int sec_small = Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]<small) {
				sec_small = small;
				small = a[i];
			}
			else if(a[i]<sec_small && a[i]!=small) {
				sec_small=a[i];
			}
		}
		System.out.println(sec_small);
		
		

	}

}
