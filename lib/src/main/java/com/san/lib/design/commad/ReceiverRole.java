package com.san.lib.design.commad;

public class ReceiverRole{
	private People people;
	private People cachePeople = new People();

	public ReceiverRole(){
		this.people =  new People();
	}

	public ReceiverRole(People people) {
		this.people = people;
	}

	public void actionUpdateAge(int age){
		System.out.println("before command:" + people.toString());
		this.people.setAge(age);
		System.out.println("after command:" + people.toString());
	}

	public void actionUpdateName(String name){
		System.out.println("before command:" + people.toString());
		this.people.setName(name);
		System.out.println("after command:" + people.toString());
	}

	public void rollBackAge(){
		this.people.setAge(cachePeople.getAge());
		System.out.println("after rollbackcommand:" + people.toString());

	}

	public void rollBackName(){
		this.people.setName(cachePeople.getName());
		System.out.println("after rollbackcommand:" + people.toString());
	}
}

