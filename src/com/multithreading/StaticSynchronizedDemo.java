
package com.multithreading;

class DisplayClass{
	/*
	 * We have two different displayClass object and two different thread working on it 
	 * Then it will show irregular behavior although we have synchronized keyword in wish()
	 * So to display regular behavior we have to put static synchronized in wish()
	 */
	public  static synchronized void  wish(String name){
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

class MySyncThreadOne extends Thread{
	DisplayClass d;
	String name;
	MySyncThreadOne(DisplayClass d, String name){
		this.d=d;
		this.name=name;
	}
	public void run(){
		d.wish(name);
	}
}

public class StaticSynchronizedDemo {

	public static void main(String[] args) {
		DisplayClass d=new DisplayClass();
		DisplayClass d2= new DisplayClass();
		MySyncThreadOne t1=new MySyncThreadOne(d, "Dhoni");
		MySyncThreadOne t2=new MySyncThreadOne(d2, "Youraj");
		t1.start();
		t2.start();

	}

}
