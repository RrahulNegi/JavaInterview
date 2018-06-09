package com.singelton;

public class DoubleCheckSingelton {
	private static DoubleCheckSingelton instance;
	private DoubleCheckSingelton(){}
	public static DoubleCheckSingelton getInstance(){
	if(instance==null){
		synchronized (DoubleCheckSingelton.class) {
			if(instance==null){
				instance=new DoubleCheckSingelton();
			}
		}
	}
	return instance; 
	}
	

}
