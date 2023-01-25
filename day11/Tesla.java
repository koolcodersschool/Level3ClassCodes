package day11;

public class Tesla extends ElectricCar{

	@Override
	public void charge() {
		System.out.println("Tesla " + model + " is charging");		
	}

	@Override
	public void start() {
		System.out.println("Tesla " + model + " is started. You can't hear it, because it's starting quetily.");
		System.out.println("Change to DRIVE MODE");
	}

	@Override
	public void drive() {
		System.out.println("Tesla " + model + " is driving");
	}

}
