package com.tuling;

import com.tuling.config.MainConfig;
import com.tuling.service.PayService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

		PayService payService = context.getBean(PayService.class);
		payService.pay("123456789", 10);

	}
}
