package com.yk.utils;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


import org.junit.Test;

public class DateUtil {
	@Test
	public void getAge() {
		String s = "2019-09-10";
		SimpleDateFormat sdf = new SimpleDateFormat();
			try {
				Date parse = (Date) sdf.parse(s);
				System.out.println(parse);
				Date date = new Date();
				long l = date.getTime()-parse.getTime();
				System.out.println(l);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public static Date getDateByMonthInit(Date src) {
		return src;
		
	}

	public static Date getDateByMonthLast(Date src) {
		return src;
		
	}

	public static int getDaysByFuture(Date future) {
		return 0;
		
	}

	public static int getDaysByDeparted(Date departed) {
		return 0;
		
	}

}
