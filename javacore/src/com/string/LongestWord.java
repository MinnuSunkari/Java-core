package com.string;
public class LongestWord {
    public static void main(String[] args) {
		String s = "I am a java developer";
		String[] str=s.split(" ");
		String longest="";
		for(int i=0;i<str.length;i++) {
			if(str[i].length()>longest.length()) {
				longest=str[i];
			}
		}
		System.out.println(longest);
	}
}
