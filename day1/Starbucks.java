package day1;

public class Starbucks {
	
	public static void main(String[] args) {
		Coffee cappuccino = new Coffee();
		cappuccino.setName("cappuccino");
		cappuccino.setSize("small");
		cappuccino.setPrice(7.99);
		cappuccino.drink();
		System.out.println(cappuccino.toString());
		
		
	}

}
