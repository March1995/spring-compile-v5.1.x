package com.tuling.testInit;


import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Person implements InitializingBean {

	public Person() {
		System.out.println("我是构造方法");
	}

	@PostConstruct
	public void initMethod() {
		System.out.println("我是初始化方法");
	}

	@PreDestroy
	public void destory() {
		System.out.println("我是销毁方法");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("我是初始化方法");
	}
}
