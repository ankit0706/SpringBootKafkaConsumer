package com.sample.demo;

public class User {
	private String name;
	private int age;
	
	public User(String n, int a) {
		this.name = n;
		this.age = a;
	}
	
	public User() {
		super();
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	@Override
	public String toString(){
		return "Item{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
	}
}
