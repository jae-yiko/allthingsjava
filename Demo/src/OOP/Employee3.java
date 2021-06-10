package OOP;

public class Employee3 extends Person {

	int emp_id;
	double emp_salary;
	
	Employee3(int id, String name, int age, char gender, double salary)
	{//super is extending from Person
		super(name,age,gender);
		//this are what i am adding
		this.emp_id=id;
		this.emp_salary=salary;
		
	}
	
	//this is being used in Starter3
	public void display3()
	{
		System.out.println("Id: " + this.emp_id);
		super.display();
		System.out.println("Salary: " + this.emp_salary);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
