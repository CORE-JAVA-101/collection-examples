package com.java.date.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class App12 {
	// Add or subtract from a date.
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");

		Calendar calendar = new GregorianCalendar(2013, 10, 28);
		System.out.println("Date : " + sdf.format(calendar.getTime()));

		// add one month
		calendar.add(Calendar.MONTH, 1);
		System.out.println("Date : " + sdf.format(calendar.getTime()));

		// subtract 10 days
		calendar.add(Calendar.DAY_OF_MONTH, -10);
		System.out.println("Date : " + sdf.format(calendar.getTime()));

	}
}
