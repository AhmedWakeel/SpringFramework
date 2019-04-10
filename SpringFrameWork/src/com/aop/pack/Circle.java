package com.aop.pack;

public class Circle {

	String name;

	public String getName() {
		return name;
	}
    @Loggable
	public void setName(String name) {
		System.out.println("  circle class setName method "+name);
		this.name = name;
//		throw(new RuntimeException());
	}
	
	/*public String setNameReturn(String name) {
		System.out.println("  circle class setNameReturn return "+name);
		this.name = name;
		return name;
	}*/
}
