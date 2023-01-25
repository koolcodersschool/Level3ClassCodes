package day9;

public class Student extends Person {
	@Override
	public void displayName(String familyName) {
		System.out.println("This method is in Student class");
		System.out.println(familyName);
	}

}
