package day11;

public abstract class ElectricCar {
	
	String model;
	double price;
	String color;
	
	public abstract void charge();
	public abstract void start();
	public abstract void drive();
	
	public void stop() {
		System.out.println("Electric car " + model + " stopped.");
	}
	
	public void displayInfo() {
		System.out.println("model: " + model);
		System.out.println("price: " + price);
		System.out.println("color: " + color);
	}

}
