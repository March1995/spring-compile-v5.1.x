package com.tuling.circularDependencies;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class ReplaceBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// 若替换 spring会报错 因为bean被修改
//		if (bean instanceof InstanceA) {
//			// 循环依赖中
//			InstanceA replaceA = new InstanceA();
//			return replaceA;
//		}
		return bean;
	}
}
