package com.javabasic;
import java.util.Arrays;
import java.util.List;


public class ArrayMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(2,4,6,4);
		System.out.println(nums);
		int[] arr= {5,3,6,8,2};
		int index=Arrays.binarySearch(arr,8);
		System.out.println(index);
		int arr1[]= {1,2,3};
		int arr2[]= {1,2};
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Arrays.compare(arr1, arr2));

	}

}
