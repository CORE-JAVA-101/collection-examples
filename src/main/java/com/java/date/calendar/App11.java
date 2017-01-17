package com.java.date.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class App11 {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");

		Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);
		System.out.println("#1. " + sdf.format(calendar.getTime()));

		//update a date
		calendar.set(Calendar.YEAR, 2014);
		calendar.set(Calendar.MONTH, 11);
		calendar.set(Calendar.MINUTE, 33);

		System.out.println("#2. " + sdf.format(calendar.getTime()));
	}
}
