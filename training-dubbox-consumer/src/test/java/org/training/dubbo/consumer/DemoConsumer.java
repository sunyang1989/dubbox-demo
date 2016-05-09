/*
 * Copyright 1999-2011 Alibaba Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.training.dubbo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.training.dubbo.api.DemoService;
import org.training.dubbo.api.UserService;

public class DemoConsumer {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		classPathXmlApplicationContext.start();

		DemoService demoService = (DemoService) classPathXmlApplicationContext.getBean("demoService");
		String world1 = demoService.sayHello("sun");

		UserService userService = (UserService) classPathXmlApplicationContext.getBean("userService");
		String world2 = userService.get(123l).toString();
		System.out.println("=====================================");
		System.out.println(world1+" | "+world2);
		System.out.println("=====================================");
	}
}