package OOPConcepts;
//displayed through Starter.java
public class Person {
	//Static variables are not related to the object
	static int count=0;
	
	String nameP;
	int ageP;
	char genderP;
	
	
	public Person(String name, int age, char gender)
	{
		nameP = name;
		ageP = age;
		genderP = gender;
		count ++;
		
	}
	
	//this is a constructor because the class name "Person" is not here
	public void display() 
	{
		// TODO Auto-generated method stub
		System.out.println("Name: " + this.nameP);
		System.out.println("Age: " + this.ageP);
		System.out.println("Gender: " + this.genderP);

	}
	
	//this is also a constructor because the class name "Person" is not here
	public static void totalPerson()
	{
		System.out.println("Number of People: " + count);
	}

}
