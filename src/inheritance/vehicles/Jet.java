package inheritance.vehicles;

public class Jet extends Vehicle {

	public Jet() { }

	@Override
	public void go() {
		System.out.println("> Jet: I'm flying fast");
	}

}
