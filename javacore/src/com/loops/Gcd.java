package com.loops;
import java.util.*;
/* int n1=6,n2=12;
int gcd =1;
for(int i=1;i<=n1 && i<=n2;i++){
    if(n1%i==0 && n2%i==0){
        gcd = i;
    }
    
}
System.out.println(gcd);*/
public class Gcd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the two numbers:");
		int num1=input.nextInt();
		int num2 = input.nextInt();
		int temp;
		while(num2!=0) {
			temp=num2;
			num2=num1%num2;
			num1=temp;
		}
		System.out.println(num1);

	}

}
