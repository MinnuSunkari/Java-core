package com.string;

public class Palindrome {

	public static void main(String[] args) {
		String str = "madam";
		char[] ch=str.toCharArray();
		String rstr="";
		for(int i=ch.length-1;i>=0;i--) {
			rstr=rstr+ch[i];
		}
		System.out.println(rstr);
		if(str.equals(rstr)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not a Palindrome");
		}
	}

}
