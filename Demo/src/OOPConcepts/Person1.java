package OOPConcepts;
//this is displayed through the file Start1.java
//this is encapsulation because i am using private

public class Person1 {
	static int count=0;
	private String pName;
	private int pAge;
	private char pGender;
	
	public Person1()
	{
		count++;
	}
//this is what will be shown through Starter1.java
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		//this.pName is referring to line 7 and pName is referring to line 17
		this.pName = pName;
	}

	public int getpAge() {
		return pAge;
	}
	public void setpAge(int pAge) {
		this.pAge = pAge;
	}

	public char getpGender() {
		return pGender;
	}
	public void setpGender(char pGender) {
		this.pGender = pGender;
	}
	
}
