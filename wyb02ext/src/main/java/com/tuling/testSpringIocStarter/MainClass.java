package com.tuling.testSpringIocStarter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
		// System.out.println(ctx.getBean(TulingDao.class));
		// System.out.println(ctx.getBean(TulingDao.class));
	}
}
