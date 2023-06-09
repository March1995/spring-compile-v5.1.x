package com.tuling.testAware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class TulingCompent implements ApplicationContextAware, BeanNameAware {

	private ApplicationContext applicationContext;

	@Override
	public void setBeanName(String name) {
		System.out.println("current bean name is :【" + name + "】");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
}
