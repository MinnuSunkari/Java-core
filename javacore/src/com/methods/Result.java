package com.methods;
import java.util.*;
public class Result {
	static int[] m=new int[5];
	double total=0;
	double avg=0;
	static void acceptMarks(){
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			m[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++) {
			System.out.print(m[i]+" ");}
		}
		double caltotal(){
			for(int i=0;i<5;i++) {
				total=total+m[i];
			}
			return total;
		}
		double calavg() {
			avg=total/5;
			return avg;
		}
		
	public static void main(String[] args) {
		Result r=new Result();
        acceptMarks();
        System.out.println(r.caltotal());
        System.out.println(r.calavg());
	}

}
