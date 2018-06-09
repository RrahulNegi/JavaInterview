package com.singelton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private SerializedSingleton(){
			
	}
	// implement readResolve method
   
	 private static class SingletonHelper{
	        private static final SerializedSingleton instance = new SerializedSingleton();
	    }
	    
	    public static SerializedSingleton getInstance(){
	        return SingletonHelper.instance;
	    }
	    protected Object readResolve()
	    {
	        return getInstance();
	    }
	    
}
