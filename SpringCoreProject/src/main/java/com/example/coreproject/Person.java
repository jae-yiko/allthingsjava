package com.example.coreproject;

import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//marking this class as an object that springboot will store for later 

@Scope(value="prototype")
@Component
public class Person {
	private int pid;
	private String pname;
	private String tech;
	
	//autowired looks for all the components and makes them available 
	//is like using another class inside this component
	@Autowired
	//it gives the component a label
	@Qualifier("laptop")
	private Laptop laptop;
	
	public Person()
	{
		System.out.println("Object created");
	}
	
	public int getPid()
	{
		return pid;
	}
	
	public void setPid(int pid)
	{
		this.pid = pid;
	}
	
	public String getPname()
	{
		return pname;
	}
	
	public void setPname (String pname)
	{
		this.pname = pname;
	}
	
	public String getTech()
	{
		return tech;
	}
	
	public void setTech(String tech)
	{
		this.tech = tech;
	}
	
	public Laptop getLaptop()
	{
		return laptop;
	}
	
	public void setLaptop (Laptop laptop)
	{
		this.laptop = laptop;
	}
	
	public void show()
	{
		System.out.println("inside person class show method");
		laptop.brandname();
	}
	
	public void displayPerson()
	{
		System.out.println("name: " + this.pname);
		System.out.println("Id: " + this.pid);
	}

}
