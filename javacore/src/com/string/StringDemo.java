package com.string;
public class StringDemo {

	public static void main(String[] args) {
		//String s1="hello";
		 //String s2="hello";
		StringBuffer s=new StringBuffer("hello");
		StringBuffer s1=new StringBuffer("hello");
		String a=s.toString();
		String b=s1.toString();
		//s1.append("world");
		//char arr[]= {'h','e','l','l','o'};
		
		System.out.println(a==b);
		
	}
}
