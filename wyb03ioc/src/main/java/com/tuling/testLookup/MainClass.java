package com.tuling.testLookup;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);

		Boos boos = ctx.getBean(Boos.class);
		System.out.println(boos.getCar());
		System.out.println(ctx.getBean(Boos.class).getCar());

	}
}
