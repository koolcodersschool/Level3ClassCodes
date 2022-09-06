package day2;

public class StaticVariables {
	
	//static variable is a shared variable
	
	public static int number = 8;
	
	public static void main(String[] args) {
		System.out.println("number = " + number);
		number = 4;
		System.out.println("number = " + number);
		number--;
		System.out.println("number = " + number);
		number++;
		System.out.println("number = " + number);
	}
	
	

}
