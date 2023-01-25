package day11;

import java.util.Iterator;

public class ElectricCarObjects {
	
	public static void main(String[] args) {
		//ElectricCar electricCar = new ElectricCar(); - We can't create object from abstract class
		
		Tesla tesla = new Tesla();
		tesla.model = "Model Y";
		tesla.price = 60000.00;
		tesla.color = "White";
		tesla.charge();
		tesla.start();
		tesla.drive();
		tesla.stop();
		tesla.displayInfo();
		
		System.out.println("===========FORD TEST==============");
		
		Ford ford = new Ford();
		ford.model = "Mustang Mach-e";
		ford.charge();
		ford.start();
		ford.drive();
		ford.stop();
		
		System.out.println("===============TESLA SEMI TEST====================");
		TeslaSemi teslaSemi = new TeslaSemi();
		teslaSemi.model = "V6";
		teslaSemi.price = 200000.00;
		teslaSemi.color = "red";
		teslaSemi.charge();
		teslaSemi.load("tomato");
		teslaSemi.start();
		teslaSemi.drive();
		teslaSemi.stop();
		teslaSemi.displayInfo();
		
	}

}
