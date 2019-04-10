package com.prac.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args)
	{
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringTest.xml");
//		System.out.println("in the main class hashcode is "+applicationContext.hashCode());
		Shape bean = (Shape)applicationContext.getBean("circle");
//		String message = applicationContext.getMessage("greeting", null, "my", null);
//		System.out.println(message);
		bean.draw();
		
		((AbstractApplicationContext)applicationContext).close();
	}
}
