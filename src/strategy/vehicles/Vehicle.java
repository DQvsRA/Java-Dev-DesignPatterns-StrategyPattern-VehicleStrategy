package strategy.vehicles;

import strategy.interfaces.IGoAlgorithm;

public abstract class Vehicle {

	private IGoAlgorithm _goAlgorithm;
	
	public Vehicle() {
		
	}
	
	public void go() {
		System.out.println("> " + this.getClass().getName());
		_goAlgorithm.go();
	}

	public void setGoAlgorithm(IGoAlgorithm goAlgorithm) {
		_goAlgorithm = goAlgorithm;
	}
}
