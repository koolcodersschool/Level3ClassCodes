package day10;

public class ConcreteClass extends AbstractClass{
	@Override
	public void displayName() {
		System.out.println("This is implementation of displayName abstract method");
	}
	
	@Override
	public void clickButton() {
		System.out.println("Clicked on button");
	}
	
	@Override
	public void justMethod() {
		System.out.println("This is just a method");
	}
	
}
