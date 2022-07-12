package com.tuling.testConfiguration;

import com.tuling.testConfiguration.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
		System.out.println(ctx.getBean("person"));
	}
}
