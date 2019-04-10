package com.stat.field;

public class Employee {

	String name;

	public static final Employee EMPLOYEE1 = new Employee("studen1");
	public static final Employee EMPLOYEE2 = new Employee("studen2");

	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static Employee getEmployee1() {
		return EMPLOYEE1;
	}

	public static Employee getEmployee2() {
		return EMPLOYEE2;
	}

}
