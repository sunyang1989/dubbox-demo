package org.training.dubbo.provider;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"classpath:/META-INF/spring/applicationContext.xml");
		ctx.start();
		System.out.println(ctx.getStartupDate());
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
