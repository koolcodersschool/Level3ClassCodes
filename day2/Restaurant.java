package day2;

public class Restaurant {
	
	public static void main(String[] args) {
		//dad, mom, kid go to restaurant and eat pizza
		
		Dinner dad = new Dinner();
		Dinner mom = new Dinner();
		Dinner kid = new Dinner();
		
		System.out.println("pizza slices = " + Dinner.pizzaSlices);
		dad.pizzaSlices = dad.pizzaSlices - 2;
		
		System.out.println("pizza slices = " + Dinner.pizzaSlices);
		mom.pizzaSlices = mom.pizzaSlices - 1;
		System.out.println("pizza slices = " + Dinner.pizzaSlices);
		
		kid.pizzaSlices = kid.pizzaSlices - 3;
		System.out.println("pizza slices = " + Dinner.pizzaSlices);
		
		System.out.println("pizza slices for dad object = " + dad.pizzaSlices);
		System.out.println("pizza slices for mom object = " + mom.pizzaSlices);
		System.out.println("pizza slices for kid object = " + kid.pizzaSlices);
		
	}

}
