package com.java.pruebas.domain;

public class Person {

	private Integer id;
	private String name;
	private Double age;
	private Double height;
	private Double weight;

	public Person() {

	}

	public Person(Integer id, String name, Double age, Double height, Double weight) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAge() {
		return age;
	}

	public void setAge(Double age) {
		this.age = age;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight
				+ "]";
	}

}
