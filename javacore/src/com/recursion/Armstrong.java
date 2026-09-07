package com.recursion;
import java.util.*;
public class Armstrong {
static int arm(int n,int c,int sum) {
	if(n<=0) {
		return sum;
	}
	sum = sum + (int)Math.pow(n%10,c);
	n=n/10;
	
	return arm(n,c,sum);
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153;int temp=n;
		int c=0;
		while(n>0) {
			
			n=n/10;
			c=c+1;
		}
		int sum =0;
		int r=arm(temp,c,sum);
		if(temp==r) {
			System.out.println("ARM");
		}
		else {
			System.out.println("not arm");
		}
	}

}
