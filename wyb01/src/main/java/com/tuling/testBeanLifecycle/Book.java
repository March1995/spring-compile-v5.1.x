package com.tuling.testBeanLifecycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Book {

	public Book() {
		System.out.println("book 的构造方法");
	}

	@PostConstruct
	public void init() {
		System.out.println("book 的PostConstruct标志的方法");
	}

	@PreDestroy
	public void destory() {
		System.out.println("book 的PreDestory标注的方法");
	}
}
