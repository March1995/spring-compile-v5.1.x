package com.tuling.testAutowired.inject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = {"com.tuling.testAutowired.inject"})
public class TulingMainConfig {

	@Primary
	@Bean
	public TulingDao tulingDao2() {
		TulingDao tulingDao = new TulingDao();
		tulingDao.setFlag(2);
		return tulingDao;
	}
}
