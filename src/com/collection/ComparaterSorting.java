package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class Person{
	private int age;
	private String name;
	private int salary;
	public Person(int age, String name, int salary) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}

class SortingOnAge implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		if(o1.getAge()==o2.getAge()){
			return 0;
		}else if(o1.getAge()>o2.getAge()){
			return 1;
		}else{
			return -1;
		}
	}
	
	
}
class SortingOnSalary implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		if(o1.getSalary()==o2.getSalary()){
			return 0;
		}else if(o1.getSalary()>o2.getSalary()){
			return 1;
		}else{
			return -1;
		}
	}
	
	
}
public class ComparaterSorting {
	
	public static void main(String args[]){
		Person personOne=new Person(20, "ABC", 1000);
		Person personTwo=new Person(36, "XYZ", 5000);
		Person personThree=new Person(25, "XXX", 6000);
		Person personFour=new Person(22, "YYY", 1000);
		ArrayList<Person> list=new ArrayList<Person>();
		list.add(personOne);
		list.add(personTwo);
		list.add(personThree);
		list.add(personFour);
		System.out.println("==== Before Sorting ======");
		for(Person person : list){
			System.out.println("Name :"+person.getName()+" Age :"+person.getAge()+" Salary :"+person.getSalary());
		}	
		Collections.sort(list, new SortingOnAge());

		System.out.println("==== After Sorting on Age ======");
		for(Person person : list){
			System.out.println("Name :"+person.getName()+" Age :"+person.getAge()+" Salary :"+person.getSalary());
		}
		
		Collections.sort(list, new SortingOnSalary());

		System.out.println("==== After Sorting on Salary ======");
		for(Person person : list){
			System.out.println("Name :"+person.getName()+" Age :"+person.getAge()+" Salary :"+person.getSalary());
		}
		
	}

}
