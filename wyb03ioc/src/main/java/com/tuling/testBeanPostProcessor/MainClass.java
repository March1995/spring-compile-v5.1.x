package com.tuling.testBeanPostProcessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
		TulingLog tulingLog = context.getBean(TulingLog.class);
		tulingLog.print();

		TulingAspect tulingAspect = context.getBean(TulingAspect.class);
		tulingAspect.invokeTulingLogPrint();

		context.close();
	}
}
