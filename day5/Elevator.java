package day5;

public class Elevator {
	
	private int currentFloor;
	
	public void goToFloor(int newFloor) {
		if(newFloor > 6 || newFloor < 0) {
			System.out.println("ERROR: There is NOT such a floor in this building: " + newFloor);
			return;
		}
		
		if(newFloor > currentFloor) {
			for(int i = currentFloor + 1; i <= newFloor; i++) {
				System.out.println("Going up to floor number: " + i);
			}
		}else if(newFloor < currentFloor) {
			for(int i = currentFloor - 1; i >= newFloor; i--) {
				System.out.println("Going down to floor number: " + i);
			}
		}else {
			System.out.println("You are already in floor number: " + newFloor);
		}
		currentFloor = newFloor;
	}

}
