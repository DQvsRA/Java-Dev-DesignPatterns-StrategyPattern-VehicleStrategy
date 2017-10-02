package inheritance.vehicles;

public class PrototypeCar extends Vehicle {

	public PrototypeCar() {
		
	}
	
	@Override
	public void go() {
		System.out.println("> PrototypeCar: I can't go.");
	}

}
