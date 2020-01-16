package com.example.demo;

import org.springframework.stereotype.Component;

@Component("john")
public class Student {
	private int rollno;
	private String name;
		
	public Student() {
		super();
		System.out.println("Inside the student constructor");
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	void display()
	{
		System.out.println("Student is present");
	}
	

}
