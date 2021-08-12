package com.mul.avatar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDependencyInjection {

	public static void main(String[] args) {
		ApplicationContext appContext
			= new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		Avatar aang = (Avatar) appContext.getBean("aang");
		aang.doBending();
		
		Avatar korra = (Avatar) appContext.getBean("korra");
		korra.doBending();
	}

}
