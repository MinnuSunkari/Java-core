package com.threads;


public class Test extends Thread{
	@Override
	public void run() {
		System.out.println("thread creating by extending runnable ");
	}
	public static void main(String[] args) {
		Test t= new Test();
		Test t2=new Test();
		//Thread th=new Thread(t);
		//String s="qwerg";
		t.start();
	   
		t2.start();
        
		System.out.println(t.getPriority());
		System.out.println(t2.getPriority());
		//System.out.println(t2.getName());
		
	}

}
