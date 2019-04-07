package com.bcbs.spring.di;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayBean implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object object, String beanName)
			throws BeansException {
		System.out.println("After Object for "+beanName);
		//System.out.println(object);
		return object;
	}

	@Override
	public Object postProcessBeforeInitialization(Object object, String beanName)
			throws BeansException {
		System.out.println("Before Object for "+beanName);
		//System.out.println(object);
		return object;
	}

}
