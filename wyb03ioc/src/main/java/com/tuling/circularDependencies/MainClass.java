package com.tuling.circularDependencies;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		//创建IOC容器
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);

		//去容器的缓存中直接拿
		InstanceA instanceA = ctx.getBean(InstanceA.class);
		ctx.close();
	}
}
