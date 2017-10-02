package strategy.vehicles;

import strategy.algorithm.go.CantGoAlgorithm;

public class PrototypeCar extends Vehicle {

	public PrototypeCar() {
		setGoAlgorithm( new CantGoAlgorithm() );
	}
}
