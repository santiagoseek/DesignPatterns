package com.san.lib.design.abstractfactory;

import java.util.Vector;

public abstract class Link extends Item{
	protected String url;

	public Link(String caption, String url) {
		super(caption);
		this.url = url;
	}
}

