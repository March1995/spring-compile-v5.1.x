package com.tuling.xmlbeanfacotry;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by smlz on 2019/6/5.
 */
public class MainClass {

    public static void main(String[] args) {
        // XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("XmlBean.xml"));
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("XmlBean.xml");
    }
}
