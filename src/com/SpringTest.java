package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	public static void main(String [] args){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		President p = (President) ctx.getBean("pre");
		p.speech();
	}
}
