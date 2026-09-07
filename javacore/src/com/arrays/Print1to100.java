package com.arrays;

public class Print1to100 {

	public static void main(String[] args) {
		int[] arr = {22, 17, 4, 66, 8, 2, 87};
		
		for(int i=1;i<=100;i++) {
			boolean flag = false;
			for(int j=0;j<arr.length;j++) {
				if(i==arr[j]) {
					flag = true;
				}
				
			}
			if(flag==false) {
				System.out.print(i + " ");
			}
		
		}

	}

}
