package com.tuling.testBeanLifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.tuling.testBeanLifecycle")
public class MainConfig {

	@Scope(value = "prototype")
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public Car car() {
		return new Car();
	}

	@Bean(initMethod = "init")
	public TulingLog tulingLog() {
		return new TulingLog();
	}

	@Bean
	public TulingBeanPostProcessor tulingBeanPostProcessor() {
		return new TulingBeanPostProcessor();
	}
}
