package com.exe.springdi4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;


@Component("serviceConsumer")
public class ServiceConsumer {
	
	@Autowired
	@Qualifier("messageService")
	MessageService ms;
	@Autowired
	TimeService ts;
	@Autowired
	JobService js;
	
	
	public void consumerService() {
		
//      생략됨
//		GenericXmlApplicationContext context = new GenericXmlApplicationContext("app-context.xml");
//		
//		MessageService ms = (MessageService)context.getBean("messageService");
		
		
		String message = ms.getMessage();
		System.out.println(message);
		
		//메소드를 통해서 
		String time = ts.getTimeService();
		System.out.println(time);
		
		js.getJob();
	}

	
	
}
