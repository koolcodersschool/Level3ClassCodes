package day5;

public class EncapsulationExample {
	
	/*
	 * OOP means Object Oriented Programming
	 * There are 4 concepts in OOP:
	 * 1. Encapsulation
	 * 2. Inheritance
	 * 3. Abstraction
	 * 4. Polymorphism
	 * 
	 * How we achieve Encapsulation:
	 * 1. We have to make all instance variables private
	 * 2. We have to provide public setter and getter methods
	 * 
	 * private keyword in front of str variable means we can access that str variable
	 * only inside this class. We can NOT access that str variable outside this class.
	 * 
	 * public keyword in front of setStr method means we can access to that setStr method
	 * from anywhere inside this project
	 */
	
	private String str;
	
	public void setStr(String str) {
		this.str = str;
	}
	
	public String getStr() {
		return this.str;
	}
	
	

}
