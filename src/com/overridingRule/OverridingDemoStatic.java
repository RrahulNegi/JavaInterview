package com.overridingRule;

class ParentStatic{
	public static int a=10;
	
	public  static void name(){
		System.out.println("Parent");
	}
}

public class OverridingDemoStatic extends ParentStatic{
	public static int a=100;
	public static void name(){
		System.out.println("Child");
	}
	public static void main(String[] args) {
		OverridingDemoStatic os=new OverridingDemoStatic();
		System.out.println("Value of a="+os.a);
		os.name();
		ParentStatic ps=new OverridingDemoStatic();
		System.out.println("value frpm parent "+ps.a);
		ps.name();
	}

}
