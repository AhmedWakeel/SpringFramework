package com.annotation.diff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanA {

	public BeanA(BeanB beanB) {
		this.beanB = beanB;
		System.out.println("creating Instance of BeanA");
	}
 
	
	private BeanB beanB;
	
	private BeanC beanC;

	public BeanB getBeanB() {
		return beanB;
	}
	@Autowired(required=false)
	public void setBeanB(BeanB beanB) {
		System.out.println("setting B");
		this.beanB = beanB;
	}

	public BeanC getBeanC() {
		return beanC;
	}
	@Autowired
	public void setBeanC(BeanC beanC) {
		System.out.println("setting C");
		this.beanC = beanC;
	}

}
