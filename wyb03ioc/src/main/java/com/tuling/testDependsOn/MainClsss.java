package com.tuling.testDependsOn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClsss {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
	}
}
