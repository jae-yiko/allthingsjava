package com.example.coreproject;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
//this component is called laptop so every componenet that has been @autowired to laptop they will also have @qualifier with the name laptop to label saying they are connected to this compoenent called "laptop"
@Component("laptop")
@Scope(value="prototype")
public class Laptop {
	private int lid;
	private String brand;
	
	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	//right click then click source then click "generate toString()" then click inhertence method
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brand=" + brand + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public void brandname()
	{
		System.out.println("HP laptop");
	}



}
