package com.java.date.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class App7 {
	/*
	 * Home » Java Basics » data types » Java Calendar example About
	 * Sotirios-Efstathios Maneas Sotirios-Efstathios Maneas Sotirios-Efstathios
	 * (Stathis) Maneas is a PhD student at the Department of Computer Science
	 * at the University of Toronto. His main interests include distributed
	 * systems, storage systems, file systems, and operating systems.
	 * 
	 * Java Calendar example Posted by: Sotirios-Efstathios Maneas in data
	 * types, Java Basics February 6th, 2014
	 * 
	 * 
	 * In this tutorial we will discuss about Java’s java.util.Calendar and how
	 * to use it. The Calendar is an abstract class that provides methods for
	 * converting between time and calendar fields. Also, the class provides
	 * fields and methods for implementing a concrete calendar system. The
	 * Calendar field values can be set by calling the following methods: set,
	 * add and roll. In addition, the Calendar has two modes for interpreting
	 * its fields, lenient and non-lenient. The lenient mode accepts a wider
	 * range of field values than it produces. The non-lenient mode is more
	 * strict and throws an exception in incorrect cases.
	 * 
	 * Create an Instance The Calendar provides a class method, called
	 * getInstance(), which returns a general object of this type, whose
	 * calendar fields have been initialized with the current date and time. For
	 * example: 1 Calendar calendar = Calendar.getInstance(); The Calendar
	 * provides getter and setter methods for its fields: public final int get
	 * (int field) public final void set (int field, int value) A subset of the
	 * Calendar fields is shown below: Calendar.YEAR Calendar.MONTH
	 * Calendar.DAY_OF_MONTH Calendar.HOUR Calendar.MINUTE Calendar.SECOND
	 */
	public static void main(String[] args) {
		// Get an instance of a Calendar, using the current time.
		SimpleDateFormat dateFormat = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		Calendar calendar = Calendar.getInstance();
		System.out.println("Calendar: " + calendar);
		System.out.println(dateFormat.format(calendar.getTime()));

		// Printing some information...
		System.out.println("ERA: " + calendar.get(Calendar.ERA));
		System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
		System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
		System.out.println("WEEK_OF_YEAR: "
				+ calendar.get(Calendar.WEEK_OF_YEAR));
		System.out.println("WEEK_OF_MONTH: "
				+ calendar.get(Calendar.WEEK_OF_MONTH));
		System.out.println("DATE: " + calendar.get(Calendar.DATE));
		System.out.println("DAY_OF_MONTH: "
				+ calendar.get(Calendar.DAY_OF_MONTH));
		System.out
				.println("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
		System.out
				.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println("DAY_OF_WEEK_IN_MONTH: "
				+ calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));
		System.out.println("HOUR: " + calendar.get(Calendar.HOUR));
		System.out
				.println("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
		System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
		System.out
				.println("MILLISECOND: " + calendar.get(Calendar.MILLISECOND));
	}
}
