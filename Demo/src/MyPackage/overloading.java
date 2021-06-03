package MyPackage;

public class overloading {
	//overloading() multiple methods can have the same name with different parameters
	static int overloadingNum(int x, int y) {
		return x + y;
	}
	
	static String overloadingStr(String x, String y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = overloadingNum(2,2);
		String combined = overloadingStr("Jae", "Ko");
		System.out.println(total);
		System.out.println(combined);
	}

}
