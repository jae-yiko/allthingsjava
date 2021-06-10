package OOP;
//displays Person.java
public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person("Billy Tom", 50, 'M');
		Person person2 = new Person("Jae Ko", 60, 'F');
		
		person1.display();
		person2.display();
		
		Person.totalPerson();
	}

}
