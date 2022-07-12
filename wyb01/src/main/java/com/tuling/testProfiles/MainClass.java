package com.tuling.testProfiles;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
/*        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(MainConfig.class);*/

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		//ctx.getEnvironment().setActiveProfiles("test","dev");

		ctx.register(MainConfig.class);
		ctx.refresh();
		printBeanName(ctx);
	}

	private static void printBeanName(AnnotationConfigApplicationContext ctx) {
		for (String beanName : ctx.getBeanDefinitionNames()) {
			System.out.println("容器中的BeanName：" + beanName);
		}
	}

}
