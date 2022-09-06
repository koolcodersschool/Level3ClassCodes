package day1;

public class InstanceVariablesExample {
	
	int age;
	String name;
	
	
	public static void main(String[] args) {
		
		InstanceVariablesExample example = new InstanceVariablesExample();
		
		example.age = 20;
		example.name = "Sanan";
		
		System.out.println("age: " + example.age);
		System.out.println("name: " + example.name);
		
		InstanceVariablesExample example2 = new InstanceVariablesExample();
		example2.age = 12;
		example2.name = "Kerim";
		System.out.println("age for example2 object: " + example2.age);
		System.out.println("name for example2 object: " + example2.name);
		
		
	}
	

}
