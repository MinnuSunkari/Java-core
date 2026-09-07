package com.arrays;

public class NonRepeating {

	public static void main(String[] args) {
		int[] a = {4,2,1,2,5};
		// method one 
		for(int i=0;i<a.length;i++) {
			int count=1;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j] && i!=j) {
					count=count+1;
				}
			}
	
			if(count==1) {
				System.out.println(a[i]);
			}
		}

	}

}
//method two
/*
for(int i=0;i<a.length;i++){
 booean nonrept = true;
 for(int j=0;j<a.length;j++){
 if(a[i]==a[j] && i!=j){
   nonrept = false;
}
}
if(boolean==true){
System.out.println(a[i]);}
}
}
}*/
