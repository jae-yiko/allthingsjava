package MyPackage;
import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			
//	--------can see which character is in what index ------------------------------------------
//		String sentence = "The best key lime pie is still up for debate";
//		int index = 2;
//		char letter = sentence.charAt(index);
//		System.out.println(sentence);
//		System.out.println("index " + index + " is the letter " + letter );
//		
//	----------concat()---------------------------------------------------	
//		String firstName ;
//		String lastName ;
//		System.out.println("enter a first name: ");
//		firstName = scan.nextLine();
//		System.out.println("enter a last name: ");
//		lastName = scan.nextLine();
//		System.out.println(firstName.concat(lastName));
//		
//-----------		
//		String firstWord;
//		String startSentence = "check what this sentence starts with";
//		System.out.println(startSentence);
//		firstWord = scan.nextLine();
//		System.out.println(startSentence.startsWith(firstWord));
//		
//		
//		String lastWord;
//		String endsSentence = "check what this sentence ends with";
//		System.out.println(endsSentence);
//		lastWord = scan.nextLine();
//		System.out.println(endsSentence.endsWith(lastWord));
//		
//		
//		String findLetter;
//		String findWord;
//		String randomstr = "this is Index of Example";
//		System.out.println(randomstr);
//		System.out.println("type letter of your interest: ");
//		findLetter = scan.nextLine();
//		System.out.println("index of character " + findLetter + " is in index " + randomstr.indexOf(findLetter));
//		System.out.println(randomstr);
//		System.out.println("type word of your interest: ");
//		findWord = scan.nextLine();
//		System.out.println("index of character " + findWord + " is in index " + randomstr.indexOf(findWord));
//		
//		
//		
//		String findLetter1;
//		String findWord1;
//		String randomstr1 = "this is Index of Example";
//		System.out.println(randomstr1);
//		System.out.println("type letter of your interest: ");
//		findLetter1 = scan.nextLine();
//		System.out.println("index of character " + findLetter1 + " is in index " + randomstr1.lastIndexOf(findLetter1));
//		System.out.println(randomstr1);
//		System.out.println("type word of your interest: ");
//		findWord1 = scan.nextLine();
//		System.out.println("index of character " + findWord1 + " is in index " + randomstr1.lastIndexOf(findWord1));
//		
//		
//		String userTyped;
//		System.out.println("write a word: ");
//		userTyped = scan.nextLine();
//		System.out.println("your word has " + userTyped.length() + " characters");
		
		//DOES NOT WORK
//		String replaceWith;
//		String original = "  Mississippi  ";
//		String replaceThe;
//		System.out.println(original);
//		System.out.println("type the letter you want to replace in the word " + original);
//		replaceThe = scan.nextInt();
//		System.out.println("type the character you want to replace a letter with");
//		replaceWith = scan.nextLine();

		
//		String original = "  Mississippi  ";
//		System.out.println(original);
//		System.out.println(priginal.replace('i','p'));
//		System.out.println(original.toLowerCase());
//		System.out.println(original.toUpperCase());
//		System.out.println(original.trim());
//		
//		
//		String original1 = "My name is Khan. My name is Bob. My name is Sonoo.";
//		System.out.println(original1);
//		System.out.println(original1.replaceAll("is", "was"));
//		
//----------		
//		String match;
//		String match1;
//		String caps;
//		String inside1;
//		String inside2;
//		String original2 = "Hello";
//		System.out.println(original2);
//		System.out.println("type a word and see if it matches the word " + original2);
//		match = scan.nextLine();
//		System.out.println(original2.equals(match));
//		System.out.println("type " + original2 + " exactly as you see it to find out if it matches");
//		match1 = scan.nextLine();
//		System.out.println(original2.equals(match1));
//		System.out.println("type the word Hello all in caps and lets see if it matches " + original2);
//		caps = scan.nextLine();
//		System.out.println(original2.equalsIgnoreCase(caps));
//		System.out.println("type a word to see if that word is inside " + original2);
//		inside1 = scan.nextLine();
//		System.out.println(original2.contains(inside1));
//		inside2 = scan.nextLine();
//		System.out.println(original2.contains(inside2));
//		
//-----------.substring() to make part of the sentence disappear using index of characters ------------------------------------		
//		int wordsNum;
//		String sentencePick = "I like nutfornuts";
//		System.out.println(sentencePick);
//		System.out.println("count up to the index you dont want: ");
//		wordsNum = scan.nextInt();
//		System.out.println(sentencePick.substring(wordsNum));
		
		
//----------isEmpty() checks if a string is empty-------------------------------------------------------------------------------
//		String isItEmpty1 ;
//		String isItEmpty2 ;
//		System.out.println("write an empty string to check if the empty function works by returning a true");
//		isItEmpty1 = scan.nextLine();
//		System.out.println(isItEmpty1.isEmpty());
//		System.out.println("write a word to check if the emtpy function is false");
//		isItEmpty2 = scan.nextLine();
//		System.out.println(isItEmpty2.isEmpty());
//		
//	------user input is checked to see if their number is greater than 10 or not------------------------	
//		int userNum;
//		System.out.println("type in a random number");
//		userNum = scan.nextInt();
//		if (userNum > 10) {
//			System.out.println(userNum + " is greater than 10");
//		}
//		else {
//			System.out.println(userNum + " is lower than 10");
//		}
//		
//---------switch case--------------------------------------------------------------------		
//		int oneToFive ;
//		String whatRating = "type in a number from 1-5 and rate the movie ";
//		System.out.println(whatRating);
//		oneToFive = scan.nextInt();
//		switch (oneToFive) {
//		case 1:
//			System.out.println("terrible");
//			
//		case 2:
//			System.out.println("not the best");
//			
//		case 3:
//			System.out.println("it was okay");
//			
//		case 4:
//			System.out.println("Good");
//			
//		case 5:
//			System.out.println("Amazing!");
//		}
//		
//		
//------------for loop to multiply users input frim 0-10-------------------------------------------------------------------------------
		System.out.println("type in a number and that number will be multipled from 0-10");
		int p;
		p = scan.nextInt();
		for(int i = 0; i <= 10; i++) {
			
			System.out.println(i + "x" + p + " = " + i*p);
		}
		
//------------this will take 3 numbers from the user and will output the largest number----------------------------------
//		int firstNum, secNum, thirdNum;
//		System.out.println("type in a number");
//		firstNum = scan.nextInt();
//		System.out.println("type in another number");
//		secNum = scan.nextInt();
//		System.out.println("type in a different number");
//		thirdNum = scan.nextInt();
//		if(firstNum > secNum && firstNum > thirdNum) {
//			System.out.println(firstNum + " this is the largest number out of the three numbers you plugged in");
//		}
//		else if (secNum > firstNum && secNum > thirdNum) {
//			System.out.println(secNum + " this is the largest number out of the three numbers you plugged in");
//		}
//		else {
//			System.out.println(thirdNum + " this is the largest number out of the three numbers you plugged in");
//		}
		
		
		
		
		
		scan.close();
	}

}
