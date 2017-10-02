package strategy.vehicles;

import strategy.algorithm.go.GoByFlyingFastAlgorithm;

public class Apache extends Helicopter {

	public Apache() {
		setGoAlgorithm( new GoByFlyingFastAlgorithm() );
	}
}
