package com.san.lib.design.abstractfactory;

/**
 * Created by test on 18/3/27.
 */

public abstract class Item {
	protected String caption;

	public Item(String caption) {
		this.caption = caption;
	}

	public abstract String makeHTML();
}

