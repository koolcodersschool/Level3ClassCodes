package day11;

public class Ford extends ElectricCar{
	
	@Override
	public void charge() {
		System.out.println("Ford " + model + " is charging.");
	}

	@Override
	public void start() {
		System.out.println("Ford " + model + " Push the start button.....");
	}

	@Override
	public void drive() {
		System.out.println("Ford " + model + " is driving....");
	}

}
