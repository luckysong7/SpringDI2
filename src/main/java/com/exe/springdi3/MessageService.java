package com.exe.springdi3;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MessageService {

	
	
	public void messageService() {
		// BeanFactory 积己
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("app-context.xml");
		
		// Bean 按眉甫 裙垫
		Message ms = (Message)context.getBean("message");
		ms.sayHello("价犁绕");
	}
	
	
}
