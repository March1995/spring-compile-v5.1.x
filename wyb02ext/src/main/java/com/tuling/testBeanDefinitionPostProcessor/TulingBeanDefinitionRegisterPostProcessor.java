package com.tuling.testBeanDefinitionPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class TulingBeanDefinitionRegisterPostProcessor implements BeanDefinitionRegistryPostProcessor {
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("TulingBeanDefinitionRegisterPostProcessor的postProcessBeanDefinitionRegistry方法");
		System.out.println("bean定义的数据量:" + registry.getBeanDefinitionCount());
		RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(TulingLog.class);
		registry.registerBeanDefinition("tulingLog", rootBeanDefinition);
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("TulingBeanDefinitionRegisterPostProcessor的postProcessBeanFactory方法");
		System.out.println(beanFactory.getBeanDefinitionCount());
	}
}
