package OOPConcepts;
import java.util.Scanner;
//displays Person.java
public class Starter {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nameP1 = null, position= null, department= null, name = null, name1 = null, major = null ;
		int ageP1 = 0, 	emp_id= 0,  bonus= 0, age=0, age1=0, stud_id =0, subject1 =0, subject2 =0, subject3=0, totalsubjects=0;
		char genderP1 = 0, gender1=0, gender =0;
		double emp_salary = 0;
		
		//Employee3 starter
		System.out.println("Name: ");
		nameP1 = scan.nextLine();
		System.out.println("Age: ");
		ageP1 = scan.nextInt();
		System.out.println("Gender: ");
		genderP1 = scan.next().charAt(0);
		System.out.println("id:");
		emp_id = scan.nextInt();
		System.out.println("Salary: ");
		emp_salary = scan.nextDouble();
		System.out.println("bonus:");
		bonus = scan.nextInt();
		System.out.println("Position: ,Department: ");
		position = scan.nextLine();
		department = scan.nextLine();
//		p1 is called a reference variable
//		after the equal sign i am actually creating an object
		Employee3 p1 = new Employee3 (nameP1, ageP1, genderP1, emp_id, emp_salary, bonus, position, department);
		p1.display3();
		System.out.println("Net Salary: " + p1.calculate(bonus) );
		String sup1 = p1.supervisor(position, department);
		
		//Person1 starter
		Person1 p2 = new Person1();
		System.out.println("type in your name:");
		name= scan.nextLine();
		p2.setpName(name);
		System.out.println("type in your age:");
		age= scan.nextInt();
		p2.setpAge(age);
		System.out.println("what is your gender: F/M");
		gender= scan.next().charAt(0);
		p2.setpGender(gender);
	
		System.out.println(p2.getpName());
		System.out.println(p2.getpAge());
		System.out.println(p2.getpGender());
		
		
		//student Starter
		System.out.println("Name: ");
		name1 = scan.nextLine();
		System.out.println("Age:");
		age1 = scan.nextInt();
		System.out.println("Gender:");
		gender1 = scan.next().charAt(0);
		System.out.println("id: ");
		stud_id = scan.nextInt();
		System.out.println("Math grade:");
		subject1 = scan.nextInt();
		System.out.println("Science grade:");
		subject2 = scan.nextInt();
		System.out.println("History grade:");
		subject3 = scan.nextInt();
		System.out.println("Major:");
		major = scan.nextLine();
		//this line is needed after scan.nextLine()because we are using scan before scan.nextLine(). if scan.nextLine() was the first scan then we would not need this line
		scan.nextLine();
		System.out.println("Total subjects:");
		totalsubjects = scan.nextInt();
		System.out.println("Position: ,Department: ");
		position = scan.nextLine();
		department = scan.nextLine();
		Student stud1 = new Student(name1, age1, gender1, stud_id, subject1, subject2, subject3, major, totalsubjects, position, department);
		stud1.displayit();
		System.out.println("Average: " + stud1.calculate(totalsubjects));
		String sup3 = stud1.supervisor(position, department);
		System.out.println(stud1.ORGANIZATION);
		Person.totalPerson();
		
		scan.close();
	}

}
