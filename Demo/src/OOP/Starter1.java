package OOP;
import java.util.Scanner;

public class Starter1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		int age;
		char gender;
		
		//user input to make person
		Person1 p1 = new Person1();
		System.out.println("type in your name:");
		name= scan.nextLine();
		p1.setpName(name);
		System.out.println("type in your age:");
		age= scan.nextInt();
		p1.setpAge(age);
		System.out.println("what is your gender: F/M");
		gender= scan.next().charAt(0);
		p1.setpGender(gender);
	
		System.out.println(p1.getpName());
		System.out.println(p1.getpAge());
		System.out.println(p1.getpGender());
		
		
		//hard coded way to make person
		Person1 p2 = new Person1();
		p2.setpName("Jenny");
		p2.setpAge(60);
		p2.setpGender('F');
		
		System.out.println(p2.getpName());
		System.out.println(p2.getpAge());
		System.out.println(p2.getpGender());
		
		
		scan.close();
	}
}
