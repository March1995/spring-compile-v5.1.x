package com.tuling.testAutowired.autowiredInMethod;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
		TulingAspect tulingAspect = ctx.getBean(TulingAspect.class);
		System.out.println(tulingAspect.toString());

		Object tulingDao = ctx.getBean(TulingLog.class);
		System.out.println(tulingDao.toString());
	}
}
