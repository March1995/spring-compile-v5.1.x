package com.tuling.testDependsOn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class MainConfig {

	@Bean
	public DependsA dependsA() {
		return new DependsA();
	}

	@Bean
	@DependsOn(value = {"dependsA"})
	public DependsB dependsB() {
		return new DependsB();
	}
}
