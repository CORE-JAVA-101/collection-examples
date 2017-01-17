package com.java.date.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class App8 {
	// Learn about GregorianCalendar from the belwo link
	// http://docs.oracle.com/javase/7/docs/api/java/util/GregorianCalendar.html
	public static void main(String[] args) {
		// Create an instance of a GregorianCalendar
		Calendar calendar = new GregorianCalendar(2014, 1, 06);
		System.out.println("Calendar: " + calendar);
		System.out.println("Year: " + calendar.get(Calendar.YEAR));
		System.out.println("Month: " + (calendar.get(Calendar.MONTH) + 1));
		System.out.println("Day: " + calendar.get(Calendar.DAY_OF_MONTH));

		// Format the output.
		SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(date_format.format(calendar.getTime()));
	}
}
