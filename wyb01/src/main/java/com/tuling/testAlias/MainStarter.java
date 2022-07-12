package com.tuling.testAlias;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainStarter {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainClass.class);
		System.out.println(ctx.getBean("aliasBean"));
		System.out.println(ctx.getBean("aliasBean2"));

	}
}
