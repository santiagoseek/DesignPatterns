package com.san.lib.design.abstractfactory;

import java.util.Iterator;

public class ListTray extends Tray{
	public ListTray(String caption) {
		super(caption);
	}

	@Override
	public String makeHTML() {
		StringBuffer sb = new StringBuffer();
		sb.append("<li>\n");
		sb.append(caption + "\n");
		sb.append("<ul>\n");
		Iterator<Item> it = tray.iterator();
		while (it.hasNext()){
			Item item = (Item) it.next();
			sb.append(item.makeHTML());
		}
		sb.append("</ul>\n");
		sb.append("</li>\n");
		return sb.toString();
	}
}

