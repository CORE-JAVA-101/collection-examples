package com.java.date.calendar;

import java.util.Date;

/**
 * Hello world!
 * 
 */
public class App1 {
	public static void main(String[] args) {

		Date d = new Date(System.currentTimeMillis());

		System.out.println("Date Object: " + d);
		System.out.println("date: " + d.getDate());
		System.out.println("day: " + d.getDay());
		System.out.println("hours: " + d.getHours());
		System.out.println("minutes: " + d.getMinutes());
		System.out.println("month: " + d.getMonth());
		System.out.println("seconds: " + d.getSeconds());
		System.out.println("time: " + d.getTime());
		System.out.println("time zone off set: " + d.getTimezoneOffset());
		System.out.println("year: " + d.getYear());

	}
}
