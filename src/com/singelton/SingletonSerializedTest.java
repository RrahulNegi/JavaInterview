package com.singelton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/*
 * Serialization also breach Singleton policy 
 * To overcome this we have to override readResolve() in Singelton classs
 */
public class SingletonSerializedTest {

	public static void main(String args[]) throws IOException, ClassNotFoundException{
		SerializedSingleton instanceOne=SerializedSingleton.getInstance();
		FileOutputStream file=new FileOutputStream("abc.ser");
		ObjectOutput out=new ObjectOutputStream(file);
		out.writeObject(instanceOne);
		
		//deserailize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream(
                "abc.ser"));
        SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
        in.close();
        
        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());
       
    

		
		
	}
}
