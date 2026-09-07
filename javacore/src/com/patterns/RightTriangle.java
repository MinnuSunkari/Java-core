package com.patterns;

public class RightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=5;
        int space=4;
        int star=1;
        for(int i=1;i<=n;i++) {
        	for(int j=1;j<=space;j++) {
        		System.out.print(" ");
        	}
        	space--;
        
        	for(int k=1;k<=star;k++) {
        		System.out.print("*");
        	}
        	star++;
        	System.out.println("");
        }
	}

}
