package org.training.dubbo.provider;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.training.dubbo.api.UserService;

public class TrainingSpring {
	
	private ApplicationContext ctx;

	@Test
	public void test() {
		ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		ctx.getBean("app");
//		UserService userService = ctx.getBean("userServiceImpl", UserService.class);
	}

}
