package org.training.dubbo.provider;

import java.io.IOException;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Training {
	private Logger log = LoggerFactory.getLogger(Training.class);
	private ApplicationContext ctx;

	@Test
	public void test() throws IOException {
		ctx = new ClassPathXmlApplicationContext(
				"classpath:META-INF/spring/applicationContext.xml");
		long startDate = ctx.getStartupDate();
		log.debug("项目启动时间:" + startDate);
		System.in.read();
	}
}
