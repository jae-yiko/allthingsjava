package OOP;

public class Overload {
	//overloading is us using calculate here and in line 11
	//static is what allows this to be used in the main(line 16)
	static int calculate(int x, int y)
	{
		System.out.println("calculate int");
		return (x+y)/2;
	}
	
	static double calculate(double x, double y)
	{
		System.out.println("calculate double");
		return x+y;
	}
	
	public static void main(String[] args) {
		int show = calculate(5,5);
		double show2 = calculate(4.3, 6.26);
		System.out.println("average: " + show);
		System.out.println("addition: " + show2);
	}

}
