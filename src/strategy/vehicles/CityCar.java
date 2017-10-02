package strategy.vehicles;

import strategy.algorithm.go.GoByDrivingAlgorithm;

public class CityCar extends Vehicle {

	public CityCar() {
		setGoAlgorithm( new GoByDrivingAlgorithm() );
	}

}
