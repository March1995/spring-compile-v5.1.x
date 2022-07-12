package com.tuling.testCreateBeanInst;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
//@ComponentScan(basePackages = {"com.tuling.testcreatebeaninst"})
public class MainConfig {

	@Bean(autowire = Autowire.NO)
	public TulingAspect tulingAspect() {
		return new TulingAspect();
	}

	@Bean
	@Primary
	public TulingLog tulingLog() {
		return new TulingLog();
	}

	@Bean
	public TulingLog tulingLog2() {
		return new TulingLog();
	}

}
