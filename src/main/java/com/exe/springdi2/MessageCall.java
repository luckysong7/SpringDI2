package com.exe.springdi2;

public class MessageCall {

	public static void main(String[] args) {

		
		// 1.
		System.out.println("1. 일반적인 객체생성 \n");
		MessageEn ob1 = new MessageEn();
		ob1.sayHello("JAEHOON");
		
		MessageKr ob2 = new MessageKr();
		ob2.sayHello("재훈");
		System.out.println();
		// 2.
		System.out.println("2. 인터페이스 객체생성 \n");
		Message ms =null;
		ms = new MessageEn();
		ms.sayHello("박보영");
		
		ms = new MessageKr();
		ms.sayHello("박보영");
		
		
	}

}
