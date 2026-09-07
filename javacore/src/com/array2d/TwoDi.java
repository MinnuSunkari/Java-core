package com.array2d;

public class TwoDi {

	public static void main(String[] args) {
		int [][] arr= {{1,2,3},{5,7,9},{9,7,5}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}

	}

}
