package day6;

public class Phone extends Device {
	public String carrier;
	
	public void call() {
		System.out.println("calling from " + brand + " phone using " + carrier);
	}
	
	public void text(String message) {
		System.out.println("Texting from " + brand + " phone using " + carrier);
		System.out.println("Message: " + message);
	}
	
}
