package strategy;

import strategy.algorithm.go.GoByDrivingFastAlgorithm;
import strategy.algorithm.go.GoByFlyingAlgorithm;
import strategy.vehicles.Apache;
import strategy.vehicles.CityCar;
import strategy.vehicles.Helicopter;
import strategy.vehicles.Jet;
import strategy.vehicles.PrototypeCar;
import strategy.vehicles.RacingCar;

public class Main 
{
	public static void main(String[] args) throws InterruptedException 
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
		
	    Thread.sleep(3000);
	    
	    System.out.println("\n========== CHANGE ALGORITHM =========\n");
	    
	    jet.setGoAlgorithm( new GoByDrivingFastAlgorithm() );
	    cityCar.setGoAlgorithm( new GoByFlyingAlgorithm() );
		
	    jet.go();
	    cityCar.go();
	}
}
