package com.recursion;

public class SumofDigit {
	/* int sum(int n){
	 * if(n==0){
	 * return 0;}
	 * return (n%10)+sum(n/10);
	 * }
	 */
	
static int sum(int num,int sum){
	if(num==0) {
		return sum;
	}
	int dig = num%10;
	sum=sum+dig;
	num=num/10;
	return sum(num,sum);
	
	
}

	public static void main(String[] args) {
		
		int res= sum(123,0);
		System.out.println(res);
		
		

	}

}
