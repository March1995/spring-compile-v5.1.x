package com.tuling.testFactoryBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = {"classpath:beans.xml"})
public class MainConfig {

	@Bean
	public CarFactoryBean carFactoryBean() {
		return new CarFactoryBean();
	}
}
