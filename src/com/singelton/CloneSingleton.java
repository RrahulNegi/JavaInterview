package com.singelton;


public class CloneSingleton extends SuperClass{
	private CloneSingleton(){}
	 private static class SingletonHelper{
		 
	        private static final CloneSingleton instance = new CloneSingleton();
	    }
	    
	    public static CloneSingleton getInstance(){
	        return SingletonHelper.instance;
	    }
	    @Override
	    protected Object clone() throws CloneNotSupportedException 
	    {
	      return CloneSingleton.getInstance();
	    }
}
