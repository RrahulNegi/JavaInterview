package com.multithreading;

class Display{
	/*
	 * If we not use synchronized keyword both thread will run and leads to unexpected behavior...
	 */
	public  synchronized void  wish(String name){
		for(int i=0;i<10;i++){
			System.out.println("Good Morning :");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
}

class MySyncThread extends Thread{
	Display d;
	String name;
	MySyncThread(Display d, String name){
		this.d=d;
		this.name=name;
	}
	public void run(){
		d.wish(name);
	}
}

public class SynchtonizedDemo {

	public static void main(String[] args) {
		Display d=new Display();
		MySyncThread t1=new MySyncThread(d, "Dhoni");
		MySyncThread t2=new MySyncThread(d, "Youraj");
		t1.start();
		t2.start();

	}

}
