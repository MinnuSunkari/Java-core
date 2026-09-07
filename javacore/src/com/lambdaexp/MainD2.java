package com.lambdaexp;

public class MainD2 {

	public static void main(String[] args) {
		Demo2 d=(int a,int b)->{
			return a+b;
			};
			System.out.println(d.sum(2, 3));
			System.out.println(d.sum(3, 10));
			System.out.println(d.sum(3, 0));

	}

}
