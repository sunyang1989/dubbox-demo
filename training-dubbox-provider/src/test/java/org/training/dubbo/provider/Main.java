package org.training.dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws Exception{
		ClassPathXmlApplicationContext classPathXmlApplicationContext =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		classPathXmlApplicationContext.start();
		System.out.println(classPathXmlApplicationContext.getStartupDate());
		Thread.sleep(1000 * 10000);

	}

}
