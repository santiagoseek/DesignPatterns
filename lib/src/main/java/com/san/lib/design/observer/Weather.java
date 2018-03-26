package com.san.lib.design.observer;

/**
 * Created by test on 18/3/26.
 */

public class Weather {
	private String description;

	public Weather(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Weather{ Description is:" + description +"};";
	}
}
