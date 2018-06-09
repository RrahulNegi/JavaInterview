package com.singelton;

/*
 * Cloning cam also breach the Singleton
 * To overcome we have to override clone()
 */
public class CloneSigletonTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		CloneSingleton instanceOne=CloneSingleton.getInstance();
		CloneSingleton instanceTwo=(CloneSingleton) instanceOne.clone();
		System.out.println("InstanceOne===>"+instanceOne.hashCode());
		System.out.println("InstanceTwo===>"+instanceTwo.hashCode());
	}

}
