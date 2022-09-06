package day2;

public class FinalVariables {
	
	public static String name = "Asad";
	public static final String finalName = "Katie";
	
	public static int number;
	public static final int count = 100;
	
	
	public static void main(String[] args) {
		System.out.println("name before changing: " + name);
		name = "Murad";
		System.out.println("name after changing: " + name);
		System.out.println("======================================================");
		System.out.println("finalName before changing is eqaul to " + finalName);
		//finalName = "Omar"; java will not let us to change the final variables
		
	}

}
