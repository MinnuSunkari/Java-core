package com.loops;
import java.util.*;
/*
 * public class Prime {
    public static void main(String[] args) {
        int num = 7;
        boolean isPrime = true;
        
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;  // no need to check further
                }
            }
        }
        
        if (isPrime)
            System.out.println(num + " is prime");
        else
            System.out.println(num + " is not prime");
    }
}
 */
public class Prime {

	public static void main(String[] args) {
		int num=7;
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count=count+1;
			}
		}
		if(count==2){
			System.out.println("num is prime");
			
		}
		else {
			System.out.println("num is not prime");
		}

	}

}
