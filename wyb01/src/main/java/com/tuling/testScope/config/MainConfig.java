package com.tuling.testScope.config;

import com.tuling.testScope.compent.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class MainConfig {

	/**
	 * 配置的bean 默认是单实例的
	 *
	 * @return
	 */
	@Bean
	@Lazy
	//@Scope(scopeName = "prototype")
	public Person person() {
		return new Person();
	}
}
