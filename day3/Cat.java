package day3;

public class Cat {
	
	private String name;
	
	/*
	 * Cunstructor is a special method
	 * Constructor doesn't have return type
	 * Constructor name should be same class name
	 * One class can have more than one constructor
	 * Constructors can be with parameter and without parameters
	 * Each and every class has default constructor
	 * If we create any custom constructor inside any class Java will NOT provide default constructor
	 * 
	 * 
	 * Purpose of constructors:
	 * 1 - to be able to create object from a class
	 * 2 - to be able to initialize (to give values) instance variables
	 */
	
	public Cat() {
		System.out.println("This is Cat cunstructor");
	}
	
	public Cat(String name) {
		System.out.println("Using Cat constructor in order to initialize name variable");
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	

}
