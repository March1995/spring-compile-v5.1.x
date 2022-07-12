package com.tuling.testBeanFactoryPostProcessor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TulingLog {

	@Value("1")
	private int flag;

	@Override
	public String toString() {
		return "TulingLog{" +
				"flag=" + flag +
				'}';
	}

	public TulingLog() {

		System.out.println("我是TulingLog的构造方法");
	}


	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}
}
