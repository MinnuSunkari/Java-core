package com.recursion;

public class Fabi {
	static int fabi(int n){
		if(n==0) {
		
			return 0 ;
		}
		else if(n==1) {
		
			return 1;
		}
		
		return fabi(n-1)+fabi(n-2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 7;
		for(int i=0;i<r;i++) {
		System.out.print(fabi(i)+" ");}

	}

}
