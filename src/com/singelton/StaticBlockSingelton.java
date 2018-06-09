package com.singelton;

/*
 * It also generate instance of Singleton class before its been used i.e ant runtime 
 */
public class StaticBlockSingelton {
	private static StaticBlockSingelton instance;
	private StaticBlockSingelton(){}
	static{
		 instance=new StaticBlockSingelton();
	}
	public static StaticBlockSingelton getINstance(){
		return instance;
	}
}
