package com.tuling;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
//@EnableAspectJAutoProxy(exposeProxy = true)
public class MainConfig {

	@Bean
	public Calculate calculate() {
		return new TulingCalculate();
	}

	@Bean
	public TulingLogAspect tulingLogAspect() {
		return new TulingLogAspect();
	}
}
