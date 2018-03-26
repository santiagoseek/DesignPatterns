package com.san.lib.design.prototype;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by test on 18/3/26.
 */

public class Person implements Cloneable {
	private String id;
	private String name;
	private int age;
	private double height;
	private double weight;
	private String address;
	private String phone;
	private ArrayList<String> hobbies = new ArrayList<>();

	public Person(){
		this.id = UUID.randomUUID().toString();
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public ArrayList<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(ArrayList<String> hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "Person{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", age=" + age +
				", height=" + height +
				", weight=" + weight +
				", address='" + address + '\'' +
				", phone='" + phone + '\'' +
				", hobbies=" + hobbies +
				'}';
	}

	@Override
	public Object clone() {
		Person person = null;
		try{
			person = (Person)super.clone();
			person.name = this.name;
			person.age = this.age;
			person.height = this.height;
			person.weight = this.weight;
			person.address = this.address;
			person.phone = this.phone;
			person.hobbies = (ArrayList<String>) this.hobbies.clone();
		}catch (CloneNotSupportedException e){
			e.printStackTrace();
		}
		return person;
	}
}
