package com.tuling.xmlBeanFacotry;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("XmlBean.xml"));
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("XmlBean.xml");
	}
}
