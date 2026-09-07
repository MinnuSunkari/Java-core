package com.lambdaexp;

public class MainD4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        Demo4 d=new Demo4();
        Runnable r=()->{
        	d.p1();
        };
        Runnable r1=()->{
        	d.p2();
        };
        Thread t= new Thread(r);
        Thread t1=new Thread(r1);
        t.start();
        Thread.sleep(1000);
        t1.start();
	}

}
