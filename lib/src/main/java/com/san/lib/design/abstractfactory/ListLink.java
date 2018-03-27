package com.san.lib.design.abstractfactory;

/**
 * Created by test on 18/3/27.
 */
public class ListLink extends Link {
	public ListLink(String caption, String url) {
		super(caption,url);
	}

	@Override
	public String makeHTML() {
		return "<li><a href=\"" + url + "\">" + caption + "</a></li>\n";
	}
}

