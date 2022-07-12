package com.tuling.testBeanLifecycle;

import org.springframework.beans.factory.InitializingBean;

public class TulingLog implements InitializingBean {

	public TulingLog() {
		System.out.println("我是TulingLog的构造方法");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("我是TulingLog的 afterPropertiesSet方法");
	}


	public void init() {
		System.out.println("我是tulinglog的init方法");
	}
}
