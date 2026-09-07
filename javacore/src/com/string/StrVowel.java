package com.string;

public class StrVowel {

	public static void main(String[] args) {
		String s="javadev";
		int count=0;
		boolean b=false;
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				System.out.print(c);
				count++;
			}
			
		}
		System.out.println("");
		System.out.println(count);
	}

}
