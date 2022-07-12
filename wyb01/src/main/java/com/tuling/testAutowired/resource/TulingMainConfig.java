package com.tuling.testAutowired.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
@ComponentScan(basePackages = {"com.tuling.testAutowired.resource"})
public class TulingMainConfig {

	@Primary
	@Bean
	public TulingDao tulingDao2() {
		return new TulingDao();
	}
}
