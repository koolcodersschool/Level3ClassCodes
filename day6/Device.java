package day6;

public class Device {
	
	/*
	 * Today's topic is INHERITANCE
	 * when we talk about inheritance in java we will need Parent and child classes
	 * Keyword in inheritance is "extends"
	 * When we create parent and child relationship in between 2 classes we will use
	 * extends keyword
	 * Is a relationship - for example TV is a Device, Phone is a Device
	 * or SmartPhone is a Phone
	 */
	
	public String brand;
	public double price;
	public String country;
	
	public void use() {
		System.out.println("Using " + brand + " costs $" + price + " and is made in " + 
	country);
	}
	

}
