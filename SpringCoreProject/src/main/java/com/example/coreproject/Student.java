package com.example.coreproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {
	private int stud_id;
	private int subject1;
	private int subject2;
	private int subject3;
	private int totalsubjects;
	@Autowired
	@Qualifier("laptop")
	private Laptop laptop;
	
	public Student()
	{
		System.out.println("student object created");
	}
	
	public int getStud_id() {
		return stud_id;
	}
	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}
	public int getSubject1() {
		return subject1;
	}
	public void setSubject1(int subject1) {
		this.subject1 = subject1;
	}
	public int getSubject2() {
		return subject2;
	}
	public void setSubject2(int subject2) {
		this.subject2 = subject2;
	}
	public int getSubject3() {
		return subject3;
	}
	public void setSubject3(int subject3) {
		this.subject3 = subject3;
	}

	public int getTotalsubjects() {
		return totalsubjects;
	}

	public void setTotalsubjects(int totalsubjects) {
		this.totalsubjects = totalsubjects;
	}

	public void showup()
	{
		System.out.println("student class showing");
		laptop.brandname();
	}
	
	public void calculate()
	{
		System.out.println("average grade: " + (this.subject1 + this.subject2 + this.subject3)/this.totalsubjects);
	}
	
}
