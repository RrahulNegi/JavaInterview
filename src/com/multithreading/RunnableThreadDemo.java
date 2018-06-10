package com.multithreading;


class MyThread implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println("Child Thread "+i);
		}
	}
	
}
public class RunnableThreadDemo {

	public static void main(String[] args) {
		MyThread t=new MyThread();
		Thread t1=new Thread(t);
		t1.start();
		for(int i=0;i<10;i++){
			System.out.println("Main Thread "+i);
		}

	}

}
