package com.spring.creation;

class Circle implements Shape {
	String type;
	int pi;

	public Circle(int pi) {
		super();
		this.pi = pi;
	}

	public Circle(String type, int pi) {
		super();
		this.type = type;
		this.pi = pi;
	}

	public Circle(String type) {
		super();
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
   @Override
	public void draw() {
		System.out.println(type + " in the Circle by using the applicationcontext "+pi);
	}
}