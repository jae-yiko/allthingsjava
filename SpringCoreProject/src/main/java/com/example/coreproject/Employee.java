package com.example.coreproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int emp_id;
	private double emp_salary;
	private int bonus;
	
	@Autowired
	@Qualifier("laptop")
	private Laptop laptop;

	public Employee()
	{
		System.out.println("employee object created");
	}
	
	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public double getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(double emp_salary) {
		this.emp_salary = emp_salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public void showit()
	{
		System.out.println("Employee class showing");
		laptop.brandname();
	}
	
	public void bonusAdded()
	{
		System.out.println(this.bonus + "+" + this.emp_salary + "=" + "$" + (this.bonus + this.emp_salary));
	}
}
