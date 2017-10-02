package inheritance.vehicles;

public class RacingCar extends Vehicle {

	public RacingCar() {
	}
	
	@Override
	public void go() {
		System.out.println("> RacingCar: I'm driving fast");
	}
}
