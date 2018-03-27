package com.san.lib.design.abstractfactory;

import java.util.Vector;

public abstract class Page{
	protected String title;
	protected String author;
	protected Vector<Item> content = new Vector<>();

	public Page(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public void add(Item item){
		content.add(item);
	}

	public String outPut(){
		StringBuffer sb = new StringBuffer();
		sb.append(title + ".html\n");
		sb.append(makeHtml());
		return sb.toString();
	}

	public abstract String makeHtml();
}
