package day10;

public class TestMethods {
	
	public static void main(String[] args) {
		
		/*
		 * If we have 2 methods one in parent class and the other one in child class
		 * we make both of them static in order to achieve method hiding.
		 */
		
		StaticMethods.displayClassName();
		MethodExample.displayClassName();
		
	}

}
