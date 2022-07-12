package com.tuling.testMessage;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ResourceBundleMessageSource;

import java.util.Locale;


public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
		ResourceBundleMessageSource resourceBundleMessageSource = context.getBean(ResourceBundleMessageSource.class);

		String test = resourceBundleMessageSource.getMessage("test", new Object[]{}, Locale.CHINA);
		String test2 = resourceBundleMessageSource.getMessage("test", new Object[]{}, Locale.US);

		System.out.println(test);
		System.out.println(test2);

	}

}
