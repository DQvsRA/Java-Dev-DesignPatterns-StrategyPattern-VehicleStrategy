package strategy.vehicles;

import strategy.algorithm.go.GoByFlyingFastAlgorithm;

public class Jet extends Vehicle {

	public Jet() { 
		setGoAlgorithm( new GoByFlyingFastAlgorithm() );
	}
}
