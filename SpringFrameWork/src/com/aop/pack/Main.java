package com.aop.pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args)
	{
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SprinAop.xml");
		ShapeService bean = applicationContext.getBean("shapeService", ShapeService.class);
		bean.getCircle().setName("malik");
//		bean.getCircle().setNameReturn("return");
		System.out.println("in the main class");
//		String name = bean.getCircle().getName();
//		System.out.println(name);
		((AbstractApplicationContext)applicationContext).close();
	}
}
