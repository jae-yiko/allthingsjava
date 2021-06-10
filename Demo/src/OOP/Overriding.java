package OOP;

//overriding is using the method name calculate from the parent Overload
public class Overriding extends Overload {
//now in here calculation method is changed to subtract 
	static int calculate(int x, int y)
	{
		System.out.println("caclulate subtraction");
		return x-y;
	}
	
	public int calculate()
	{
		return super.calculate(5, 5);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int show = calculate(5,5);
//		System.out.println(calculate());
		
		Overload show = new Overload();
		show.calculate(5, 5);
		
		double show2 = calculate(4.3, 6.26);
		System.out.println("average: " + show);
		System.out.println("addition: " + show2);
		int subtract = calculate(5,1);
		System.out.println("subtract: " + subtract);
		
	}

}
