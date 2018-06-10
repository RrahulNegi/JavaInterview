package com.multithreading;

class MyThreadYeild implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()
				+ " is going to call yield() method...");
		Thread.yield();

		System.out.println(Thread.currentThread().getName() + " is completed.");
	}
		
	
	
}
public class ThreadYeildDemo {

	public static void main(String[] args) {
		Thread td=new Thread(new MyThreadYeild());
		Thread td2=new Thread(new MyThreadYeild());
		td.start();
		td2.start();

	}

}
