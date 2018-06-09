package com.overridingRule;

import java.io.IOException;

class ParentException{
	
	public void name()   {
		System.out.println("Parent");
	}
}

public class OverridingExceptionRule extends ParentException {
// If parent class overriden fumction  dosnt throws any exception so child class overriding method must throws Runtime Exception only
//	public void name()throws IOException{ ===> throws Compile Time Exception
	public void name()throws ArithmeticException{
		System.out.println("Child");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
