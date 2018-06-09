package com.overridingRule;

 class ParentAccesibility{
	private int a=10;
	// if parent method is public so overriden method must be public
	// if parent method is \protected so overriden method must be public or protected
	// if parent method is default so overriden method must be either default or public or protected
	    protected void name(){
		System.out.println("Parent");
	}
}
public class OverridingAccesibilityRule extends ParentAccesibility {
	  public void name(){
		System.out.println("Child");
	}
	int a=100;
	public static void main(String[] args) {

	}

}
