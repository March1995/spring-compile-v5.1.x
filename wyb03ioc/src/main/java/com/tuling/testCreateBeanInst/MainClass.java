package com.tuling.testCreateBeanInst;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
		System.out.println(context.getBean("tulingAspect"));
	}
}
