package com.exe.springdi4;

import org.springframework.context.support.GenericXmlApplicationContext;

public class ServiceConsumer {
	
	
	
	MessageService ms;
	TimeService ts;
	JobService js;
	
	
	// 생성자 의존성 주입
	public ServiceConsumer(MessageService ms) {
		this.ms = ms;
	}
	
	// 위의 과정이 아래와 같다.
	// MessageService ms = new MyMessageService();
	
	// 메소드(setter)의존성 주입
	
	public void setTimeService(TimeService ts) {
		this.ts = ts;
	}
	
	public void setJobService(JobService js) {
		this.js = js;
	}
	
	
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
