package OOP;

public class Setnget {
	String name;
	int age;
	
	public static void main (String[] args)
	{//after writing this part right click look for source then click generate getters and setters
		Setnget a = new Setnget();
		a.setName("Jae");
		a.setAge(10);
		//this is displayed because of the public String getName()
		System.out.println(a.getAge());
		System.out.println(a.getName());
		
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	
}
