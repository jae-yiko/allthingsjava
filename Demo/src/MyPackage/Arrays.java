package MyPackage;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//--------------------this is a normal array----------------------------
//		String[] gems = {"moissinate", "diamond", "sapphire"};
//		System.out.println(gems[0]);
		
		Scanner scan = new Scanner(System.in);		
//		--------------this is user making an array with numbers--------------------------------
//		int[] num0 = new int[] {1,2,3,4,5};
//		int[] num1 = new int[5];//<<this is setting a limit of 5 spaces in the gem1 array
//		
//		System.out.println("plug in 5 numbers you want to add to this array");
//		//this for loop is to get users input 5 times
//		for(int i=0; i<num1.length; i++) 
//		{
//			num1[i] = scan.nextInt();
//		}
//		//this for loop is to display users input 
//		System.out.println("array values are:");
//		for (int i=0; i<num1.length; i++ )
//		{
//			System.out.println(num1[i]);
//		}
		
		
		
//		------------this is user making an array with strings-------------------------------------------
	
//		String[] word1 = new String[5];
//		
//		System.out.println("plug in 5 words you want to add to this array");
//		//this for loop is to get users input 5 times
//		for(int i=0; i<word1.length; i++) 
//		{
//			word1[i] = scan.nextLine();
//		}
//		//this for loop is to display users input 
//		System.out.println("array values are:");
//		for (int i=0; i<word1.length; i++ )
//		{
//			System.out.println(word1[i]);
//		}
		
		
//		-----------------this is user making array with characters----------------------------
//		char[] letter = new char[5];
//		System.out.println("plug in 5 words you want to add to this array");
//		//this for loop is to get users input 5 times
//		for(int i=0; i<letter.length; i++) 
//		{
//			letter[i] = scan.next().charAt(0);
//		}
//		//this for loop is to display users input 
//		System.out.println("array values are:");
//		for (int i=0; i<letter.length; i++ )
//		{
//			System.out.println(letter[i]);
//		}
		
		
//-------------finding vowels---------------------------------------------------------------------
		String list = "$1=sOda, $2= bread, $3= ice cream";
		System.out.println("how many vowels are in this sentence: " + list);
//		char[] vowel= {'a','e','i','o','u'};
//		int vowelIndex = 0;
		String lowerCaseList = list.toLowerCase();
		for(int i=0; i<list.length(); i++) 
		{
//			if(list.charAt(i)=='a' || list.charAt(i)=='e' || list.charAt(i)=='i' || list.charAt(i)=='o' || list.charAt(i)=='u') {
//				vowelIndex++;
			if(lowerCaseList.charAt(i)=='a' || lowerCaseList.charAt(i)=='e' || lowerCaseList.charAt(i)=='i' || lowerCaseList.charAt(i)=='o' || lowerCaseList.charAt(i)=='u') {
				System.out.println(list.charAt(i) );
			}
		}
		
		
		
		
		
		
		scan.close();
	}

}
