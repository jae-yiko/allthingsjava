package MyPackage;

public class Hello {

	public static void main(String[] args) {
//		int stores whole numbers between -2,147,483,648 to 2,147,483,647
		int num=1;
		
//		byte stores whole numbers between -128 to 127
		byte lessNum = 127;
		
//		short stores whole numbers from -32,768 to 32,767
		short middleNum = 32_767;
		
//		char stores a single letter
		char oneLetter = 'a';
		
//		float stores 6-7 decimal digits
		float flNum = 1.1234567f;
		
//		double stores 15 decimal digits
		double myNum = 1.15d;
		
		boolean isJavaFun = true;
		String name="jae";
		
//		shortcut for System.out.println(oneLetter) is to write sysout ctrl+space;
		System.out.println("the number is " + num);
		System.out.println(lessNum);
		System.out.println(middleNum);
		System.out.println(oneLetter);
		System.out.println(flNum);
		System.out.println(myNum);
		System.out.println(isJavaFun);
		System.out.println(name);

	
		
	}

}
