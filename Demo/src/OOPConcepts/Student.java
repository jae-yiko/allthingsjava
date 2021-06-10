package OOPConcepts;
//this is displayed through the file StudentStarter.java
public class Student extends Person implements PersonInterface {

	int stud_id;
	int subject1;
	int subject2;
	int subject3;
	String major;
	int totalsubjects;
	String position;
	String department;
	
	Student(String name, int age, char gender, int stud_id, int subject1, 
			int subject2, int subject3, String major, int totalsubjects, String position, String department)
	{
		super(name,age,gender);
		this.stud_id = stud_id;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.major = major;
		this.totalsubjects = totalsubjects;
		this.position = position;
		this.department = department;
	}
	
	public void displayit()
	{
		System.out.println("student id: " + this.stud_id);
		super.display();
		System.out.println("subjects: " + this.subject1 + ", " + this.subject2 + ", " + this.subject3);
		System.out.println("major: " + this.major);
		System.out.println("totalsubjects: " + this.totalsubjects);
	}
	
	//this is the interface part
	public double calculate(int totalsubjects)
	{
		double average = ((this.subject1 + this.subject2 + this.subject3)/this.totalsubjects);
		return average;
	}
	
	public String supervisor(String position, String department) 
	{
		System.out.println(this.position + " " + this.department);
		return this.position + " " + this.department;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



}
