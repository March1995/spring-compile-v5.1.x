package com.tuling.testScope;

import com.tuling.testScope.compent.Person;
import com.tuling.testScope.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
		Person person = (Person) ctx.getBean("person");
		Person person2 = (Person) ctx.getBean("person");
		System.out.println(person == person2);
	}
}
