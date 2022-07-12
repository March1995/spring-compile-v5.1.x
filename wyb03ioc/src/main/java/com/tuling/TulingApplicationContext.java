package com.tuling;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TulingApplicationContext extends AnnotationConfigApplicationContext {

	@Override
	protected void initPropertySources() {
		getEnvironment().setRequiredProperties("tuling");
	}

	public TulingApplicationContext(Class<?>... annotatedClasses) {
		super(annotatedClasses);
	}
}
