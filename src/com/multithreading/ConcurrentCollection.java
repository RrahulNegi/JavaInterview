package com.multithreading;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentCollection extends Thread {
/*
 * This is concurrent collection so it wont throw any exception
 */
	static CopyOnWriteArrayList list = new CopyOnWriteArrayList<String>();

	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Child Thread" + " going to add element");
		}
		list.add("D");
	}

	public static void main(String[] args) {
		list.add("A");
		list.add("B");
		list.add("C");

		TraditionalCollectionThread t = new TraditionalCollectionThread();
		t.start();
		// Now we iterate through the ArrayList
		// and get exception ConcurrentModification Exception
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			String s = (String) itr.next();
			System.out.println(s);
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(list);

	}

}
