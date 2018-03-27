package com.san.lib.design.abstractfactory;

/**
 * Created by test on 18/3/27.
 */

public abstract class Factory {
	public static Factory getFactory(Class<?> cls){
		Factory factory = null;
		try {
			factory = (Factory) cls.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return factory;
	}

	public abstract Link createLink(String caption, String url);
	public abstract Tray createTray(String caption);
	public abstract Page createPage(String title, String author);
}
