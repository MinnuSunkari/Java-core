package com.recursion;

public class Reverse {
	static int rev(int n,int r) {
		if(n==0) {
			return r;
		}
		return rev(n/10, r*10+(n%10));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123;
		int r=0;
         int res=rev(n,r);
         System.out.println(res);
	}

}
