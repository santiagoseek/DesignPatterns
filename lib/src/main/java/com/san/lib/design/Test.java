package com.san.lib.design;

import com.san.lib.design.observer.Observable;
import com.san.lib.design.observer.Observer;
import com.san.lib.design.observer.Weather;
import com.san.lib.design.prototype.Person;

import java.util.ArrayList;

/**
 * Created by test on 18/3/26.
 */

public class Test {
	public static void main(String[] args){
		System.out.println("this is test");
		observerTest();
		prototypeTest();
	}

	/*
	   Android开发中常见的设计模式
	   https://www.cnblogs.com/android-blogs/p/5530239.html
	 */
	public static void observerTest(){
		Observable<Weather> observable = new Observable<>();
		Observer<Weather> observer0 = new Observer<Weather>() {
			@Override
			public void onUpdate(Observable<Weather> observable, Weather data) {
				System.out.println("observer 0:" + data.toString());
			}
		};

		Observer<Weather> observer1 = new Observer<Weather>() {
			@Override
			public void onUpdate(Observable<Weather> observable, Weather data) {
				System.out.println("observer 1:" + data.toString());
			}
		};

		observable.register(observer0);
		observable.register(observer1);

		Weather weather = new Weather("晴转多云");
		observable.notifyObservers(weather);

		Weather weather0 = new Weather("晴天");
		observable.notifyObservers(weather0);

		Weather weather1 = new Weather("小雨");
		observable.notifyObservers(weather1);

		observable.unregister(observer0);

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
}
