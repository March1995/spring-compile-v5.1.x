package com.tuling.testBeanLifecycle;

public class Car {

	public Car() {
		System.out.println("Car的构造方法..........");
	}


	public void init() {
		System.out.println("Car的初始化方法......init");
	}

	public void destroy() {
		System.out.println("Car的销毁方法.....destroy");
	}


}
