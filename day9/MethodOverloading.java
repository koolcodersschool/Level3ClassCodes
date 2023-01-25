package day9;

public class MethodOverloading {
	
	/*
	 * Method overloading:
	 * 1 - method names should be same
	 * 2 - parameters/arguments should be different
	 */
	
	public static void main(String[] args) {
		String str = "Asad";
		
		addNumbers(3, 9.0);
		addNumbers(4.5, 6.8);
		concatination("Murad");
		
		System.out.println(concatination("Murad"));
		System.out.println(concatination(str, "Senan"));
	}
	
	public static void addNumbers(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void addNumbers(double a, double b) {
		System.out.println(a+b);
	}
	
	public static String concatination(String text) {
		return "name: " + text;
	}
	
	public static String concatination(String text1, String text2) {
		return text1 + text2;
	}
	
	

}
