package com.resourcr.loading;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) throws IOException
	{
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-diff.xml");
		  CustomResourceLoader bean = applicationContext.getBean("customResource",CustomResourceLoader.class);
		  bean.showData();
		  ((AbstractApplicationContext)applicationContext).close();
		  
//		applicationContext.getBean("");
	}

}