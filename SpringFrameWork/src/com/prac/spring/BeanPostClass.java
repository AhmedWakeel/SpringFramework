package com.prac.spring;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostClass implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object object, String name) {
		System.out.println("bean before " + name);
		return object;

	}

	@Override
	public Object postProcessAfterInitialization(Object object, String name) {
		System.out.println("bean after  " + name);
		return object;

	}

}
