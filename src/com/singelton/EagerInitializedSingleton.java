package com.singelton;
/*
 * This eager initialize will generate singelton instance at time of class Load
 */

public class EagerInitializedSingleton {
	private static EagerInitializedSingleton instance= new EagerInitializedSingleton();
	private EagerInitializedSingleton(){}
	public static EagerInitializedSingleton getInstance(){
		return instance;
	}

}
