package com.multithreading;

class MyJoinThread implements Runnable {

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("Thread started: " + t.getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("Thread ended: " + t.getName());

	}

}

public class JoinThreadDeno {

	public static void main(String[] args) {
		Thread th1 = new Thread(new MyJoinThread(), "th1");
		Thread th2 = new Thread(new MyJoinThread(), "th2");
		Thread th3 = new Thread(new MyJoinThread(), "th3");
		th1.start();
		/*
		 * Start second thread(th2) once first thread(th1) is dead
		 */
		try {
			th1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		th2.start();
		/*
		 * Start third thread(th3) once second thread(th2) is dead
		 */
		try {
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th3.start();
	}

}
