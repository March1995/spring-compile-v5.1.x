package com.tuling.testBeanPostProcessor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.tuling.testBeanPostProcessor")
public class MainConfig {

	@Bean(initMethod = "init")
	public Compent compent() {
		return new Compent();
	}
}
