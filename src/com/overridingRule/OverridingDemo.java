package com.overridingRule;


class Parent{
	public int a=10;
}
public class OverridingDemo extends Parent {

	public int a=100;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OverridingDemo od=new OverridingDemo();
		System.out.println("value of a="+od.a);
		
		Parent p=new OverridingDemo();
		System.out.println("Called by parent value of a="+p.a);
	}

}
