package com.loops;
import java.util.*;
public class Amstrong {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number :");
		int num = input.nextInt();
		int temp=num;
		int sum=0;
		while(num>0) {
			 int dig = num%10;
			sum=sum+(dig*dig*dig);
			num=num/10;
		}
		if(temp==sum) {
			System.out.println(temp+" is a Amstrong number");
		}
		else {
			System.out.println(temp+" is not a Amstrong number");
		}

	}

}
