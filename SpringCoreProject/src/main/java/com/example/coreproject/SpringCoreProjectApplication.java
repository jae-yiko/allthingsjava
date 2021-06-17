package com.example.coreproject;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringCoreProjectApplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		SpringApplication.run(SpringCoreProjectApplication.class, args);
		ConfigurableApplicationContext Context = SpringApplication.run(SpringCoreProjectApplication.class, args);
		System.out.println("SpringBoot app running");
		//getBean is equivilant to getNew
		int pid =0, emp_id=0, pid1 =0, bonus=0, subject1=0, subject2=0, subject3=0, totalsubjects=0;
		String pname=null, pname1=null;
		double emp_salary=0;
		
		Person p1 = Context.getBean(Person.class);
		System.out.println("Name: ");
		pname = scan.nextLine();
		p1.setPname(pname);
		System.out.println("id:");
		pid = scan.nextInt();
		p1.setPid(pid);
		p1.show();
		
		//this is allowed to be made because of scope
		Person p2 = Context.getBean(Person.class);
		System.out.println("Name: ");
		scan.nextLine();
		pname = scan.nextLine();
		p2.setPname(pname);
		System.out.println("id:");
		pid = scan.nextInt();
		p2.setPid(pid);
		p2.show();
		
		Employee e1 = Context.getBean(Employee.class);
		e1.showit();
		System.out.println("id:");
		emp_id = scan.nextInt();
		e1.setEmp_id(emp_id);
		System.out.println("Salary: ");
		emp_salary = scan.nextDouble();
		e1.setEmp_salary(emp_salary);
		System.out.println("bonus:");
		bonus = scan.nextInt();
		e1.setBonus(bonus);
		e1.bonusAdded();
		
		Student s1 = Context.getBean(Student.class);
		s1.showup();
		System.out.println("Math grade:");
		subject1 = scan.nextInt();
		s1.setSubject1(subject1);
		System.out.println("Science grade:");
		subject2 = scan.nextInt();
		s1.setSubject2(subject2);
		System.out.println("History grade:");
		subject3 = scan.nextInt();
		s1.setSubject3(subject3);
		System.out.println("Total subjects:");
		totalsubjects = scan.nextInt();
		s1.setTotalsubjects(totalsubjects);
		s1.calculate();
		
		scan.close();
//		scope create mutliple objects
	}

}