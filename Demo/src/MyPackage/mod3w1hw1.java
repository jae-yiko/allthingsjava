package MyPackage;
import java.util.Scanner;

public class mod3w1hw1 {
//	static means we can call on it within the rest of the class

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int calculate ;

		String calculator1 = "type the number of our choice(1:addition, 2:subtraction, 3:multiplication, 4:division, 5:exit)";
		String number1str = "plug in your first number";
		String number2str = "plug in your second number";
		System.out.println(number1str);
		int num1 = scan.nextInt();
		System.out.println(number2str);
		int num2 = scan.nextInt();
		System.out.println(calculator1);
		calculate = scan.nextInt();

		switch (calculate) {
		case 1:
			System.out.println(Add(num1, num2));
			break;
			
		case 2:
			System.out.println(Subtract(num1, num2));
			break;
			
		case 3:
			System.out.println(Multiply(num1, num2));
			break;
			
		case 4:
			Divison(num1, num2);
			break;
			
		case 5:
			Exit();
			break;
		default:
			System.out.println("Please pick from these options next time( 1:addition, 2:subtraction, 3:multiplication, 4:division, 5:exit");
		}	
	
		scan.close();
	}
	
	public static int Add(int num1, int num2) {
//		System.out.println(num1+num2);
		return num1 + num2;
	}
		
	public static int Subtract(int num1, int num2) {
		return num1-num2;
	}
		
	public static int Multiply(int num1, int num2) {
		return num1*num2;
	}
		
	public static void Divison(int num1, int num2) {
		System.out.println(num1/num2);
		System.out.println("remainder:" + num1%num2);
//this one will not show the reminder it will just round it up and give one number
//System.out.println(num1/num2);
		
	}
		
	public static void Exit() {
		System.out.println("Thank you for using Jae's calculator");
		System.exit(0);
	}

}
