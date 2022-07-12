package com.tuling.testSpringIocStarter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {TulingService.class})
@ComponentScan(basePackages = "com.tuling.testSpringIocStarter")
public class MainConfig {

	@Bean
	public TulingDataSource tulingDataSource() {
		return new TulingDataSource();
	}

}
