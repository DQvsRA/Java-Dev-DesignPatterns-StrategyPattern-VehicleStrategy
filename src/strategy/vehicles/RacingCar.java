package strategy.vehicles;

import strategy.algorithm.go.GoByDrivingFastAlgorithm;

public class RacingCar extends Vehicle {

	public RacingCar() {
		setGoAlgorithm( new GoByDrivingFastAlgorithm() );
	}
}
