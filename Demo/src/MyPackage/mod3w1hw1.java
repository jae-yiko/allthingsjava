package MyPackage;
import java.util.Scanner;

public class mod3w1hw1 {
//	static means we can call on it within the rest of the class
	static int num1;
	static int num2;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int calculate ;

		String calculator1 = "type the number of our choice(1: addition, 2:subtraction, 3:multiplication, 4:division, 5:exit)";
		String number1str = "plug in your first number";
		String number2str = "plug in your second number";
		System.out.println(number1str);
		num1 = scan.nextInt();
		System.out.println(number2str);
		num2 = scan.nextInt();
		System.out.println(calculator1);
		calculate = scan.nextInt();

		switch (calculate) {
		case 1:
			Add();
			break;
			
		case 2:
			Subtract();
			break;
			
		case 3:
			Multiply();
			break;
			
		case 4:
			Divison();
			break;
			
		case 5:
			Exit();
			break;
		default:
			System.out.println("Thank you for using Jae's calculator");
		}	
	
		scan.close();
	}
	
	public static void Add() {
		System.out.println(num1+num2);
	}
		
	public static void Subtract() {
		System.out.println(num1-num2);
	}
		
	public static void Multiply() {
		System.out.println(num1*num2);
	}
		
	public static void Divison() {
		System.out.println(num1/num2+"."+(num1%num2));
//this one will not show the reminder it will just round it up and give one number
//System.out.println(num1/num2);
	}
		
	public static void Exit() {
		System.exit(0);
	}

}