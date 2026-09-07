package com.string;

public class StrReverse {

	public static void main(String[] args) {
	  String s="javadev";
	  String rs="";
	  for(int i=s.length()-1;i>=0;i--) {
		  char c= s.charAt(i);
		  rs=rs+c;
	  }
	  System.out.println(s);
	  System.out.println(rs);
	  if(s.equals(rs)) {
		  System.out.println("palindrome");
	  }
	  else {
		  System.out.println("not a palindrome");
	  }

	}

}
