package com.multithreading;

public class DeadlockThread extends Thread {
	static Thread mainThread;

	public void run() {
		System.out.println("Child Thread waiting for" + " main thread completion");
		try {
			mainThread.join();
		} catch (InterruptedException e) {
			System.out.println("Child thread execution" + " completes");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		DeadlockThread.mainThread = Thread.currentThread();
		DeadlockThread thread = new DeadlockThread();
		thread.start();
		System.out.println("Main thread waiting for " + "Child thread completion");

		// main thread is waiting for the completion
		// of Child thread
		thread.join();

		System.out.println("Main thread execution" + " completes");
	}

}
