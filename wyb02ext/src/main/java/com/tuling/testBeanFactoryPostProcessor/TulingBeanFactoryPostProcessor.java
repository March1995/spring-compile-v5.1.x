package com.tuling.testBeanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class TulingBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("IOC 容器调用了TulingBeanFactoryPostProcessor的postProcessBeanFactory方法");
		for (String name : beanFactory.getBeanDefinitionNames()) {
			if ("tulingLog".equals(name)) {
				BeanDefinition beanDefinition = beanFactory.getBeanDefinition(name);
				beanDefinition.setLazyInit(true);
			}

		}
	}
}
