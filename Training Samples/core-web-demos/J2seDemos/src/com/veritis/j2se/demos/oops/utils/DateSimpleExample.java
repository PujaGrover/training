package com.veritis.j2se.demos.oops.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateSimpleExample {

	public static void main(String[] args)  {
		String DATE_FORMAT = "EEE MMMMM yyyy HH:mm:ss.SSSZ";
		Date date=new Date();
		System.out.println(date);
		SimpleDateFormat format=new SimpleDateFormat(DATE_FORMAT);
		System.out.println(format.format(date));
		
	}

}
