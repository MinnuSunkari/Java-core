package com.arrays;
import java.util.*;

public class Readarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("enter the array elements:");
		for(int i=0;i<arr.length;i++) {
			 arr[i] = sc.nextInt();
		}
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
		System.out.println(" ");
		System.out.println("first element = " + arr[0]);
		System.out.println("last element = " + arr[arr.length-1]);

	}

}
