package com.string;

public class FreqSubstring {

	public static void main(String[] args) {
		String str1 = "we work to live and live to be happy live";
		String word = "live";  
		int count=0;
        String[] str=str1.split(" ");
        for(int i=0;i<str.length;i++) {
        	if(word.equals(str[i])) {
        		count++;
        	}
        
        }
      System.out.println(count);
	}

}
