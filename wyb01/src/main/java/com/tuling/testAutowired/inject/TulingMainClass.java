package com.tuling.testAutowired.inject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TulingMainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TulingMainConfig.class);
		TulingService tulingService = ctx.getBean(TulingService.class);
		System.out.println(tulingService.toString());

		Object tulingDao = ctx.getBean("tulingDao");
		System.out.println(tulingDao.toString());
	}
}
