package com.san.lib.design.proxy;

public class ProxyObject extends AbstractObject{
	RealObject realObject = new RealObject();
	@Override
	public void operation() {
		System.out.println("before proxy.");
		realObject.operation();
		System.out.println("after proxy.");
	}
}
