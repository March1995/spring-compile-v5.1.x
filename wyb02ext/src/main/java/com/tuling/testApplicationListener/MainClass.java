package com.tuling.testApplicationListener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
		ctx.publishEvent(new ApplicationEvent("我手动发布了一个事件") {
			private static final long serialVersionUID = -4266338286824980023L;

			@Override
			public Object getSource() {
				return super.getSource();
			}
		});

		ctx.close();
	}
}
