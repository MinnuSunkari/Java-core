package com.arrays;
import java.util.*;
public class Largestelement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max =0;
		System.out.println("enter the n value:");
		int n= sc.nextInt();
		int[] arr = new int[n];
		System.out.println("enter the array elements:");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			max = arr[0];
			if(arr[i]>arr[0]) {
				max = arr[i];
			}
			else {
				max = arr[0];
			}
		}
		System.out.println(max);
		sc.close();

	}

}
