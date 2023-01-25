package day6;

public class DevicesTest {
	
	public static void main(String[] args) {
		System.out.println("============== DEVICE ==============");
		Device device = new Device();
		device.brand = "LG";
		device.country = "South Korea";
		device.price = 900.99;
		device.use();
		
		System.out.println("=============== TV ================");
		TV tv = new TV();
		tv.brand = "Sony";
		tv.price = 800.99;
		tv.country = "Japan";
		tv.screenSize = 65;
		tv.isSmart = true;
		tv.use();
		tv.watch();
		
		System.out.println("================ PHONE ===============");
		Phone phone = new Phone();
		phone.brand = "Apple IPhone";
		phone.price = 900.99;
		phone.country = "US";
		phone.carrier = "Sprint";
		phone.use();
		phone.call();
		phone.text("Java is fun!!!");
		
		System.out.println("==================== SMART PHONE ==============");
		SmartPhone smartPhone = new SmartPhone();
		smartPhone.brand = "Samsung Galaxy NOTE 11";
		smartPhone.price = 899.99;
		smartPhone.country = "South Korea";
		smartPhone.carrier = "Verizon";
		smartPhone.memorySize = 128;
		
		smartPhone.use();
		smartPhone.call();
		smartPhone.text("Inheritance is fun!!!");
		smartPhone.useApp("Discord");
		
		
		
	}

}
