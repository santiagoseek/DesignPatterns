package com.san.lib.design.strategy;

/**
 * Created by test on 18/3/26.
 */

public class TravelContext {
	private IStrategy iStrategy;

	public IStrategy getStrategy() {
		return iStrategy;
	}

	public void setStrategy(IStrategy iStrategy) {
		this.iStrategy = iStrategy;
	}

	public void travel(){
		if(iStrategy !=null){
			iStrategy.travel();
		}
	}
}
