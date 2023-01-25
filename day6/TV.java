package day6;

public class TV extends Device { 
	
	public int screenSize;
	public boolean isSmart;
	
	public void watch() {
		System.out.println("Watching " + brand + " TV screenSize " + screenSize + 
				" and TV is smart: " + isSmart);
	}

}
