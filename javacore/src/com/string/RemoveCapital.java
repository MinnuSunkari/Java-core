package com.string;
public class RemoveCapital {

	public static void main(String[] args) {
		String  s = "jAvA DeVeloPer";
		String r="";
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i]>=65 && c[i]<=88) {//for small 95-121
				continue;        //0-9 ->48-57
			}
			else {
				r=r+c[i];
			}
		}
		System.out.println(r.replace(" ", ""));
	}
}
