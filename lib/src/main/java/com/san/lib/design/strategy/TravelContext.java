package com.san.lib.design.strategy;

/**
 * Created by test on 18/3/26.
 */

public class TravelContext {
	private Strategy strategy;

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public void travel(){
		if(strategy!=null){
			strategy.travel();
		}
	}
}
