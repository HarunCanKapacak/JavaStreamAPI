package com;

public class Person {
	private String name;
	private int age;
	private String nationality;

	public Person(String name, int age, String nationality) {
		this.name = name;
		this.age = age;
		this.nationality = nationality;
	}

	public Person(String name, int age) {
		this(name, age, "");
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

  @Override
	public String toString() {
		return "name:" + name + " age:" + age + " nationality:" + nationality ;
	}

public String getNationality() {
    return nationality;
  }
}





























