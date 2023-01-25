package day4;

public class StaticBlockExample {
	
	static {
		System.out.println("This is static block");
		//StaticKeyword.displayName("Kerem");
	}

	public static void print() {
		System.out.println("This is print method");
	}
	
	public StaticBlockExample() {
		System.out.println("This is default constructor");
	}
	
	public StaticBlockExample(String str) {
		System.out.println("This is custom constructor with str = " + str);
	}
	
	
}
