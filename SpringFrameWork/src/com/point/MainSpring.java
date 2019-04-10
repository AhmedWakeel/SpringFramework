package com.point;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] ars)
	{
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		applicationContext.registerShutdownHook();
		Triangle bean = applicationContext.getBean("triangle_collection",Triangle.class);
		bean.disp();
		/*bean.display();*/
	}
}
