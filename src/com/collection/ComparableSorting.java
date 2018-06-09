package com.collection;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
	private String name;
	private int age;
	public Student(String name, int age) {
		super();
		this.name = name;
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
	@Override
	public int compareTo(Student o) {
		if(o.age==age){
		return 0;
		}
		else if(age>o.age){
			return 1;
		}
		else{
			return -1;
		}
	}
	
	
}
public class ComparableSorting {

	public static void main(String args[]){
	Student std=new Student("rahul",10);
	Student std1=new Student("rahul Singh",50);
	Student std2=new Student("rahul Negi",3);
	Student std3=new Student("rahul",30);
	ArrayList<Student>list=new ArrayList<Student>();
	list.add(std);
	list.add(std1);
	list.add(std2);
	list.add(std3);
	Collections.sort(list);
	for(Student student:list){
		System.out.println("name :"+student.getName()+":: age :"+student.getAge());
	}
	
	}
	

	
}
