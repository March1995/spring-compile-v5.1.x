package com.tuling.testConditional.config;

import com.tuling.testConditional.compent.TulingAspect;
import com.tuling.testConditional.compent.TulingLog;
import com.tuling.testConditional.condition.TulingCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

public class MainConfig {

	//@Bean
	public TulingAspect tulingAspect() {
		return new TulingAspect();
	}

	@Bean
	@Conditional(value = TulingCondition.class)
	public TulingLog tulingLog() {
		return new TulingLog();
	}
}
