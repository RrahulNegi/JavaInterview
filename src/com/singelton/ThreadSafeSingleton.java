package com.singelton;

/*
 * Use synchronized to overcome multithread problem now at a time only one thread will access the getInstance()
 */
public class ThreadSafeSingleton {
	private ThreadSafeSingleton() {
	}
	private static ThreadSafeSingleton instance;
	public static synchronized ThreadSafeSingleton getInstance(){
		if(instance==null){
		instance= new ThreadSafeSingleton();
		}
		return instance;
	}

}
