package day1;

public class Coffee {
	
	private String name;
	private String size;
	private double price;
	
	
	public Coffee() {
		
	}
	
	public Coffee(String name, String size, double price) {
		this.name = name;
		this.size = size;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		switch(size.toLowerCase()) {
		case "small":
			this.size = "small";
			break;
		case "medium":
			this.size = "medium";
			break;
		case "large":
			this.size = "large";
			break;
		default:
			System.out.println("ERROR: Invalid size - " + size);
		}
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void drink() {
		System.out.println("Drinking " + size + " " + name + " that I bought for $" + price);
	}
	
	
	public String toString() {
		return "Coffee{" + "name=" + name + " size=" + size + " price=" + price + "}";
	}
	
}
