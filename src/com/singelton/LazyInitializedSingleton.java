package com.singelton;
/*
 * This generate the object only if not created earlier
 * Only case of MultiThreading env i.e if two thread tried to access the getInstance() then it will break Singleton Patterns
 */
public class LazyInitializedSingleton {

	private LazyInitializedSingleton(){}
	private static LazyInitializedSingleton instance;
	public static LazyInitializedSingleton getInstance(){
	if(instance==null){
		instance = new LazyInitializedSingleton();
	}
	return instance;
	}
}
