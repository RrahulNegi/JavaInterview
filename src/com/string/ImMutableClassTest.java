package com.string;

 final class Student{
		private final String name;
		private final Age age;

	 public Student(String name, Age age){
		 this.name=name;
		// this.age=age;
		 
		 /*
		  * This make Student class 
		  */
		 Age cloneAge=new Age();
		 cloneAge.setDob(age.getDob());
		 this.age=cloneAge;
	 }
	
	public String getName(){
		return name;
	}
	
	public Age getAge(){
		return age;
	}
}
 
 class Age{
	 private int dob;

	/**
	 * @return the dob
	 */
	public int getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(int dob) {
		this.dob = dob;
	}
	 
 }

public class  ImMutableClassTest {

	public static void main(String[] args) {
		Age age=new Age();
		age.setDob(1985);
		Student std=new Student("Rahul",age);
		System.out.println("Name==="+std.getName());
		System.out.println("Age===="+std.getAge().getDob());
		age.setDob(2000);
		System.out.println("Age===="+std.getAge().getDob());

		

	}

}
