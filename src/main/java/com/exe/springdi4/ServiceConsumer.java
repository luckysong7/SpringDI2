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
		
//      ������
//		GenericXmlApplicationContext context = new GenericXmlApplicationContext("app-context.xml");
//		
//		MessageService ms = (MessageService)context.getBean("messageService");
		
		
		String message = ms.getMessage();
		System.out.println(message);
		
		//�޼ҵ带 ���ؼ� 
		String time = ts.getTimeService();
		System.out.println(time);
		
		js.getJob();
	}

	
	
}
