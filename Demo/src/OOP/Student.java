package OOP;
//shown through the while StudentStarter.java
public class Student extends Person {

	int stud_id;
	String subject1;
	String subject2;
	String subject3;
	String major;
	int gpa;
	
	Student(String name, int age, char gender, int stud_id, String subject1, 
			String subject2, String subject3, String major, int gpa)
	{
		super(name,age,gender);
		this.stud_id = stud_id;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.major = major;
		this.gpa = gpa;
		
	}
	
	public void displayit()
	{
		System.out.println("student id: " + this.stud_id);
		super.display();
		System.out.println("subjects: " + this.subject1 + ", " + this.subject2 + ", " + this.subject3);
		System.out.println("major: " + this.major);
		System.out.println("gpa: " + this.gpa);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
