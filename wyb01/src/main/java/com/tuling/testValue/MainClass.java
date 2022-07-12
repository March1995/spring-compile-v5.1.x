package com.tuling.testValue;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);

		Person person = ctx.getBean(Person.class);
		System.out.println(person.toString());
	}
}
