package com.lambdaexp;

public class MainD1 {

	public static void main(String[] args) throws InterruptedException{
		Demo1 d= new Demo1();
		Runnable r1=()->{
			System.out.println("div3");
			d.div3();
		
		};
		Runnable r2=()->{
			System.out.println("div4");
			d.div4();
			
		};
		Thread t1= new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		Thread.sleep(1000);
		t2.start();

	}

}
