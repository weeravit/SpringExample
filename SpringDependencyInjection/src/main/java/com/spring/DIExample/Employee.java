package com.spring.DIExample;

import java.util.List;

public class Employee {

	private String name;
	private int age;
	private Department department;
	private List<String> telephones;

	public Employee() {
		this.name = "";
		this.age = 0;
		this.department = null;
		this.telephones = null;
	}

	public Employee(String name) {
		this.name = name;
	}

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<String> getTelephones() {
		return telephones;
	}

	public void setTelephones(List<String> telephones) {
		this.telephones = telephones;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", department=" + department + ", telephones=" + telephones
				+ "]";
	}
	
}
