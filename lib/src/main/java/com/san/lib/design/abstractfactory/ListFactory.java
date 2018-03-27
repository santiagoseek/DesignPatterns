package com.san.lib.design.abstractfactory;

/**
 * Created by test on 18/3/27.
 */

public class ListFactory extends Factory {
	@Override
	public Link createLink(String caption, String url) {
		return new ListLink(caption,url);
	}

	@Override
	public Tray createTray(String caption) {
		return new ListTray(caption);
	}

	@Override
	public Page createPage(String title, String author) {
		return new ListPage(title,author);
	}
}
