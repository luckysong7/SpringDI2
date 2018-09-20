package com.exe.springdi4;

import java.text.DateFormat;
import java.util.Date;

public class MyTimeService implements TimeService {

	public String getTimeService() {

		//출력형식
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		//출력형식에 맞춰서 현재 날짜 만들기
		String now = dateFormat.format(new Date());
		
		return now;
	}

}
