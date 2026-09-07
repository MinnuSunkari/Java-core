package com.string;

public class StringOcc {

	public static void main(String[] args) {
		 String s="javaEEdeve";
		 for(int i=0;i<s.length();i++) {
			 char c=s.charAt(i);
			 if(c=='e' || c=='E') {
				 continue;
			 }
			 System.out.print(c);
		 }

	}

}
