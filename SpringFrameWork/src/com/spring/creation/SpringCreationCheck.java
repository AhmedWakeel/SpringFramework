package com.spring.creation;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class SpringCreationCheck {
	Shape shape;
	public void setShap(Shape shape)
	{
		this.shape = shape;
	}
	public void callDraw()
	{
		shape.draw();
	}
	
	public static void main(String[] args)
	{
//		SpringCreationCheck check = new SpringCreationCheck();
		
		BeanFactory beanFactory1 = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("spring.xml");
		Circle bean =(Circle) beanFactory.getBean("circle");
		Circle bean1 =(Circle) beanFactory.getBean("circle");
		bean.draw();
		Circle bean2 = (Circle) beanFactory1.getBean("circle");
		bean2.draw();
		System.out.println(bean2.hashCode()+" "+bean.hashCode()+" "+bean1.hashCode());
		((ClassPathXmlApplicationContext)beanFactory).close();
		/*Triangle triangle = new Triangle();
		Circle circle = new Circle();
        		
		check.setShap(triangle);
		check.setShap(circle);
		check.callDraw();*/
	}
}





