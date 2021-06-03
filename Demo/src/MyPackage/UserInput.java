package MyPackage;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		String name;
		String str;
		
		//read input in java but not efficient if you want input methods
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number: ");
		//.nextInt() is a method of Scanner that reads int value from the user
		num=scan.nextInt();
		
		System.out.println("enter a word: ");
		//.next() is used for for only one word. delimiter = divides two words with a space 
		str=scan.next();
		
		
		scan.nextLine();
		System.out.println("Enter your name: ");
		//.nextLine is for String. You are able to write more than one word here and it will show everything
		name=scan.nextLine();
		
		System.out.println("The number is: " + num);
		System.out.println("Random word I " + str);
		System.out.println("The name you entered is: " + name);

		scan.close();
	}

}
