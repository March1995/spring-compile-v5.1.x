package com.tuling.testBeanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class TulingAspect implements ApplicationContextAware {

	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	public void invokeTulingLogPrint() {
		TulingLog tulingLog = applicationContext.getBean(TulingLog.class);
		tulingLog.print();
	}
}
