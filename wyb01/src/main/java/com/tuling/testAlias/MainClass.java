package com.tuling.testAlias;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainClass {

	@Bean(name = {"aliasBean", "aliasBean2"})
	public AliasBean aliasBean() {
		return new AliasBean();
	}
}
