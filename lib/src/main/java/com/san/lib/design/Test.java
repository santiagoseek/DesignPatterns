package com.san.lib.design;

import com.san.lib.design.abstractfactory.Factory;
import com.san.lib.design.abstractfactory.Link;
import com.san.lib.design.abstractfactory.ListFactory;
import com.san.lib.design.abstractfactory.Page;
import com.san.lib.design.abstractfactory.Tray;
import com.san.lib.design.commad.ConcreteCommandImpl0;
import com.san.lib.design.commad.ConcreteCommandImpl1;
import com.san.lib.design.commad.ICommand;
import com.san.lib.design.commad.InvokeRole;
import com.san.lib.design.commad.ReceiverRole;
import com.san.lib.design.factory.ILocation;
import com.san.lib.design.factory.LocationFactory;
import com.san.lib.design.observer.Observable;
import com.san.lib.design.observer.IObserver;
import com.san.lib.design.observer.Weather;
import com.san.lib.design.prototype.Person;
import com.san.lib.design.proxy.AbstractObject;
import com.san.lib.design.proxy.ProxyObject;
import com.san.lib.design.strategy.IStrategy;
import com.san.lib.design.strategy.TravelContext;

import java.util.ArrayList;

/**
 * Created by test on 18/3/26.
 */

public class Test {
	public static void main(String[] args){
		System.out.println("this is test");
		observerTest();
		prototypeTest();
		strategyTest();
		factoryTest();
		abstractFactoryTest();

		//command pattern https://github.com/simple-android-framework-exchange/android_design_patterns_analysis/tree/master/command/lijunhuayc
		commandTest();
		proxyTest();
	}

	/*
	   Android开发中常见的设计模式
	   https://www.cnblogs.com/android-blogs/p/5530239.html
	 */
	public static void observerTest(){
		Observable<Weather> observable = new Observable<>();
		IObserver<Weather> IObserver0 = new IObserver<Weather>() {
			@Override
			public void onUpdate(Observable<Weather> observable, Weather data) {
				System.out.println("observer 0:" + data.toString());
			}
		};

		IObserver<Weather> IObserver1 = new IObserver<Weather>() {
			@Override
			public void onUpdate(Observable<Weather> observable, Weather data) {
				System.out.println("observer 1:" + data.toString());
			}
		};

		observable.register(IObserver0);
		observable.register(IObserver1);

		Weather weather = new Weather("晴转多云");
		observable.notifyObservers(weather);

		Weather weather0 = new Weather("晴天");
		observable.notifyObservers(weather0);

		Weather weather1 = new Weather("小雨");
		observable.notifyObservers(weather1);

		observable.unregister(IObserver0);

		Weather weather2 = new Weather("台风");
		observable.notifyObservers(weather2);
	}

	public static void prototypeTest(){
		Person person = new Person();
		person.setName("one");
		person.setAddress("shanghai");
		person.setAge(13);
		person.setHeight(145);
		person.setWeight(45);
		person.setPhone("123456");
		ArrayList<String> hobby = new ArrayList<>();
		hobby.add("football");
		hobby.add("backetball");
		hobby.add("swim");
		person.setHobbies(hobby);
		System.out.println(person);

		Person p = (Person) person.clone();
		System.out.println(p);
		p.setName("new ONE");
		hobby.add("walking");
		p.setHobbies(hobby);
		System.out.println(p);


	}

	/*
	https://github.com/simple-android-framework-exchange/android_design_patterns_analysis/blob/master/strategy/gkerison/README.md
	 */
	public static void strategyTest(){
		TravelContext travelContext = new TravelContext();
		travelContext.setStrategy(new WalkIStrategy());
		travelContext.travel();

		travelContext.setStrategy(new PlaneIStrategy());
		travelContext.travel();

		travelContext.setStrategy(new RealwayIStrategy());
		travelContext.travel();
	}

	static class WalkIStrategy implements IStrategy {
		@Override
		public void travel() {
			System.out.println("walk travelling....");
		}
	}

	static class PlaneIStrategy implements IStrategy {
		@Override
		public void travel() {
			System.out.println("plane travelling....");
		}
	}

	static class RealwayIStrategy implements IStrategy {
		@Override
		public void travel() {
			System.out.println("realway travelling....");
		}
	}

	public static void factoryTest(){
		ILocation position = LocationFactory.getInstance("gaode");
		position.getPosition();
		position.getCityName(10,20);
	}

	/*
	http://www.cnblogs.com/TerryBlog/archive/2011/07/25/2116617.html
	 */
	public static void abstractFactoryTest() {
		Factory factory = Factory.getFactory(ListFactory.class);
		Link cnblogs = factory.createLink("博客园","https://www.cnblogs.com/");
		Link cto = factory.createLink("51CTO","http://www.51cto.com/");
		Link csdn = factory.createLink("csdn","https://www.csdn.net/");

		Tray cnblogsTray = factory.createTray("NO.1 Blog");
		cnblogsTray.add(cnblogs);

		Tray ctoTray = factory.createTray("NO.2 Blog");
		ctoTray.add(cto);

		Tray csdnTray = factory.createTray("NO.3 Blog");
		csdnTray.add(csdn);

		Page page = factory.createPage("My Blogs","santiago");
		page.add(cnblogsTray);
		page.add(ctoTray);
		page.add(csdnTray);

		System.out.println(page.outPut());
	}

	public static void commandTest() {
		ReceiverRole receiverRole = new ReceiverRole();
		ICommand command = new ConcreteCommandImpl0(receiverRole);
		ICommand command0 = new ConcreteCommandImpl1(receiverRole);

		InvokeRole invokeRole = new InvokeRole();
		invokeRole.setCommand0(command);
		invokeRole.setCommand1(command0);

		invokeRole.invoke(0);
		invokeRole.invoke(1);
	}


	/*
	https://github.com/simple-android-framework-exchange/android_design_patterns_analysis/blob/master/proxy/singwhatiwanna/README.md
	 */
	public static void proxyTest() {
		AbstractObject obj = new ProxyObject();
		obj.operation();
	}
}
