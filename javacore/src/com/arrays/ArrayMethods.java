package com.arrays;
import java.util.*;
public class ArrayMethods {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		String[] a= {"abc","erty"};
		//length
		//System.out.println(arr.length);
		
		//sort 
		//Arrays.sort(arr);
		
		//print an array using toString
		//System.out.println(Arrays.toString(arr));
		
		//binarysearch
		//int place=Arrays.binarySearch(arr, 5);
		//System.out.println(place);
		
		//copyOf array
		int[] copy=Arrays.copyOf(arr, arr.length);
		
		//to check to arrays are equal 
		//System.out.println(Arrays.equals(arr, copy));
		
		//compare to arrays
		//System.out.println(Arrays.compare(arr, copy));
		
		//asList
		List<String> list = Arrays.asList(a);

		System.out.println(list);
 
		/*for(int n:copy) {
			System.out.print(n+" ");
		}*/

	}

}
