package day3;

public class Fruite {
	
	
	
	private String name;
	
	public void printName(String name) {
		this.name = name;
		System.out.println("name = " + this.name);
	}
	
	public Fruite() {
		System.out.println("This is Fruite constructor");
	}

	
	public static void displayName() {
		System.out.println("This is static method");
	}
	
	
	
}
