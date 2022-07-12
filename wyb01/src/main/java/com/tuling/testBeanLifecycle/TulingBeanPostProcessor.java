package com.tuling.testBeanLifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 后置处理器  在bean调用初始化方法前后进行调用
 */
//@Component
public class TulingBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("TulingBeanPostProcessor...postProcessBeforeInitialization:" + beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("TulingBeanPostProcessor...postProcessAfterInitialization:" + beanName);
		return bean;
	}
}
