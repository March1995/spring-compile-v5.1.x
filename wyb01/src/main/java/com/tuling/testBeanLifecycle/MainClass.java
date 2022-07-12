package com.tuling.testBeanLifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
		//Car car = ctx.getBean(Car.class);

		ctx.close();
	}
}
