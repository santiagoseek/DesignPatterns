package com.san.lib.design.commad;

public class People{
	private int age = -1;
	private String name = "";

	public People(){}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	protected People clone() {
		return new People();
	}

	@Override
	public String toString() {
		return "People{" +
				"age=" + age +
				", name='" + name + '\'' +
				'}';
	}
}

