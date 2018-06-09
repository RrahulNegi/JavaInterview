package com.singelton;

/*
 * Using reflection api we can break the Singleton pattern
 * We can use Enum Singelton Pattern for this
 */
import java.lang.reflect.Constructor;

public class ReflectionSingeltonTest {

	public static void main(String args[]){
		EagerInitializedSingleton instanceOne=EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton instanceTwo=null;
		try{
			Constructor[] conc=EagerInitializedSingleton.class.getDeclaredConstructors();
			for(Constructor constructor : conc){
				constructor.setAccessible(true);
				instanceTwo=(EagerInitializedSingleton) constructor.newInstance();
				break;
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("instanceOne===>>"+instanceOne.hashCode());
		System.out.println("instanceTwo===>>"+instanceTwo.hashCode());

		
	}
}
