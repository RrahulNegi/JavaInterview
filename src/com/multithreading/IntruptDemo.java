package com.multithreading;

class MyThreadDemo implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println("Child Thread "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class IntruptDemo {

	public static void main(String[] args) {
		Thread t=new Thread(new MyThreadDemo());
		t.start();
		t.interrupt();
	}

}
