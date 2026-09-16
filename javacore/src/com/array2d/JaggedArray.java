package com.array2d;
import java.util.*;
public class JaggedArray {
//   Jagged array 
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int[][] arr=new int[3][];
        arr[0]=new int[2];
        arr[1]=new int[3];
        arr[2]=new int[4];
        arr[0][0]=2;
        arr[0][1]=3;
        arr[1][0]=1;
        arr[1][1]=6;
        arr[1][2]=2;
        arr[2][0]=3;
        arr[2][1]=4;
        arr[2][2]=7;
        arr[2][3]=9;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }

	}

}
