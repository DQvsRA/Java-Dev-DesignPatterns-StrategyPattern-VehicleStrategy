package inheritance;

import inheritance.vehicles.Apache;
import inheritance.vehicles.CityCar;
import inheritance.vehicles.Helicopter;
import inheritance.vehicles.Jet;
import inheritance.vehicles.PrototypeCar;
import inheritance.vehicles.RacingCar;

public class Main 
{
	public static void main(String[] args) 
	{
		CityCar cityCar = new CityCar();
		RacingCar racingCar = new RacingCar();
		Helicopter helicopter = new Helicopter();
		PrototypeCar prototypeCar = new PrototypeCar();
		
		Jet jet = new Jet();
		Apache apache = new Apache();
		
		cityCar.go();
		racingCar.go();
		helicopter.go();
		prototypeCar.go();
		
		jet.go();
		apache.go();
	}
}
