package strategy.vehicles;

import strategy.algorithm.go.GoByFlyingAlgorithm;

public class Helicopter extends Vehicle {

	public Helicopter() {
		setGoAlgorithm( new GoByFlyingAlgorithm() );
	}
}
