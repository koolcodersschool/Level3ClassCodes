package day4;

public class StaticKeyword {
	
	/*
	 * We can use static keyword:
	 *  - when we create variables (if needed)
	 *  - when we create methods (if needed)
	 *  - when we create static blocks. Static block runs before everything else inside the class
	 *  - We can have more than one static blocks in one class
	 *  - When we create inner classes
	 * 
	 * When we have static block, constructor, and static method in one class. And if we create object
	 * from that class and call static method then the order will be as following:
	 * 1 - static block will run
	 * 2 - constructor will run
	 * 3 - static method will run
	 * 
	 * Instance block runs when we create object from a class. It runs after static block, but before
	 * constructor.
	 * 
	 * 
	 */
	
	public static String str;
	
	public static void displayName(String name) {
		System.out.println("name = " + name);
	}
	
	static {
		System.out.println("This is static block - static block runs before everything else in class");
	}
	
	static {
		System.out.println("This is second static block");
	}
	
	

}
