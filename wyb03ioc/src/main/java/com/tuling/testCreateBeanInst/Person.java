package com.tuling.testCreateBeanInst;

import org.springframework.stereotype.Component;

@Component
public class Person {

	private String name;

	public Person() {
		System.out.println("我是person的无参构造器");
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				'}';
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
