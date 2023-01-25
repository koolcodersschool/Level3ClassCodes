package day11;

public class TeslaSemi extends ElectricTruck{

	@Override
	public void load(String item) {
		System.out.println("TeslaSemi - load item " + item + " by lowering the truck and opening a door");		
	}

	@Override
	public void charge() {
		System.out.println("TeslaSemi is charging");	
	}

	@Override
	public void start() {
		System.out.println("TeslaSemi - start truck by pressing button...");
	}

	@Override
	public void drive() {
		System.out.println("TeslaSemi - truck is driving...");
	}

}
