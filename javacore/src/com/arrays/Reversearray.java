package com.arrays;

public class Reversearray {

	public static void main(String[] args) {
		int[] arr = {3,4,5,6,7,2};
		int[] arr1 = new int[6];
		for(int i=0;i<arr.length;i++) {
			arr1[arr.length-1-i]= arr[i];
		}
		/* int temp = a[i];
		 * a[i]=a[a.length-1-i];
		 * a[a.length-1-i]=temp; no need of arr1 array
		 */
		System.out.println("original array: ");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		System.out.println("reverse order:");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}

	}

}
