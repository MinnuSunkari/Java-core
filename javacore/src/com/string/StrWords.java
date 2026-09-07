package com.string;

public class StrWords {

	public static void main(String[] args) {
		String s="iam a java dev in codg";
		int c=0;
		String[] str=s.split(" ");
		for(int i=0;i<str.length;i++) {
			c++;
		}
		System.out.println(c);
		

	}

}
