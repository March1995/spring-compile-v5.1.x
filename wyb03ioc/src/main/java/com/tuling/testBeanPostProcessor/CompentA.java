package com.tuling.testBeanPostProcessor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CompentA {

	@Autowired
	private CompentB compentB;

	private CompentC compentC;

	public CompentC getCompentC() {
		return compentC;
	}

	@Autowired
	public void setCompentC(CompentC compentC) {
		this.compentC = compentC;
	}

	public CompentB getCompentB() {
		return compentB;
	}

	public void setCompentB(CompentB compentB) {
		this.compentB = compentB;
	}
}
