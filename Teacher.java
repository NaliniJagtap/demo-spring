package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
public class Teacher {
	
	private int id;
	private String name;
	
	@Autowired
	@Qualifier("john")
	private Student s;
	
	public Teacher() {
		super();
		System.out.println("Inside constructor");
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	void show()
	{
		System.out.println("Inside the show");
		s.display();
	}
	
	
	

}
