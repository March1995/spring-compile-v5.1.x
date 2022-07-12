package com.tuling.testAutowired.autowiredInMethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.tuling.testAutowired.autowiredInMethod")
public class MainConfig {

	@Bean
	public TulingAspect tulingAspect(@Autowired TulingLog tulingLog) {
		TulingAspect tulingAspect = new TulingAspect(tulingLog);
		return tulingAspect;
	}
}
