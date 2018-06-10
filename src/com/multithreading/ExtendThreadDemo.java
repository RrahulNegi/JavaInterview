package com.multithreading;



public class ExtendThreadDemo extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("Child Thread "+i);
		}
	}
	public static void main(String[] args) {
		ExtendThreadDemo t=new ExtendThreadDemo();
		t.start();
		for(int i=0;i<10;i++){
			System.out.println("Main Thread "+i);
		}
	}

}
