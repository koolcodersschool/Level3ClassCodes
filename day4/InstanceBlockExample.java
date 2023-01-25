package day4;

public class InstanceBlockExample {
	
	static {
		System.out.println("This is static block");
	}
	
	public InstanceBlockExample() {
		System.out.println("This is a constructor");
	}
	
	{
		System.out.println("This is an instance block");
	}
	
	public static void displayName(String name) {
		System.out.println("name = " + name);
	}
	
	
}
