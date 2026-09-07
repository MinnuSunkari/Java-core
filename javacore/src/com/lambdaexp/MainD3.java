package com.lambdaexp;

public class MainD3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Demo3 m=new Demo3();
        Runnable r=()->{
        m.nprint(); 
        };
        Thread t=new Thread(r);
        t.start();
	}

}
