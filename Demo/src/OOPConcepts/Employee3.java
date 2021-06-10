package OOPConcepts;

//this is displayed through file Starter3.java
public class Employee3 extends Person implements PersonInterface {

	int emp_id;
	double emp_salary;
	int bonus;
	String position;
	String department;
	
	//IT HAS TO BE IN THE SAME ORDERIN THE STARTER
	Employee3(String name, int age, char gender, int id, double salary, int bonus, String position, String department)
	{//super is extending from Person
		super(name,age,gender);
		//these are what i am adding
		this.emp_id=id;
		this.emp_salary=salary;
		this.bonus = bonus;
		this.position = position;
		this.department = department;
	}
	
	//this is being used in Starter3
	public void display3()
	{
		System.out.println("Id: " + this.emp_id);
		super.display();
		System.out.println("Salary: " + this.emp_salary);
		System.out.println(ORGANIZATION);
	}
	
	//this is the interface part
	public double calculate(int bonus)
	{
		double netsalary = this.bonus + this.emp_salary;
		return netsalary;
	}
	
	public String supervisor(String position, String department) 
	{
		System.out.println(this.position + ", " + this.department);
		return this.position + " " + this.department;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}


}
