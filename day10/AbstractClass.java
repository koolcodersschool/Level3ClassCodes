package day10;

public abstract class AbstractClass extends AbstractClass2{
	
	/*
	 * In order to create abstract class we need "abstract" keyword
	 * 
	 * We canNOT create object from Abstract class
	 * We can store abstract methods inside Abstract class
	 * What is abstract method?
	 * 1. Abstract method doesn't have implementation
	 * 2. Abstract method should have "abstract" keyword
	 * 3. We should override Abstract methods in concrete classes.
	 * What is Concrete class?
	 * 1. Concrete class is the class that extends Abstract class.
	 * 2. Concrete class canNOT be abstract class.
	 * It is just regular class.
	 */
	
	public abstract void displayName();
	public abstract void clickButton();
	

}
