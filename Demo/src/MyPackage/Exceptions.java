package MyPackage;
import java.util.Scanner;

public class Exceptions {
//https://www.youtube.com/watch?v=K_-3OLkXkzY
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//exception is an event that happens when we try to run our program that makes the program stops working  
//exception is an event that happens when we click the run button that changes the flow of the program 
//the reason why we handle exception errors is incase the user inputs something incorrectly it may shut the program down and thats not what we want. instead we want them to correct their inputs

//------exception handling using string array-----------------------------		
			//try is what we want to run normally
//			try {
//				int[] num1 = new int[5];//<<this is setting a limit of 5 spaces in the gem1 array
//			
//				System.out.println("plug in 5 numbers you want to add to this array");
//				//this for loop is to get users input 5 times
//				for(int i=0; i<num1.length; i++) 
//				{
//					num1[i] = scan.nextInt();
//				}
//				//this for loop is to display users input 
//				System.out.println("array values are:");
//				for (int i=0; i<num1.length; i++ )
//				{
//					System.out.println(num1[i]);
//				}
//			}
//			//catch is always needed after try to ensure that when or if an error occurs we can have the user retry again without having the whole program shut down
//			//and Exception e means to catch all errors
//			catch(Exception e) {
//				System.out.println("you must use a number");
//			}


//---exception handling using strings----------------------------
		
		try {
			int i;
			System.out.println("type in a number");
			i = scan.nextInt();
			System.out.println(i);
		}
		catch(Exception e){

			System.out.println("type in a number");

		}
	


		
		
		
		
		
		
		scan.close();
	}

}
