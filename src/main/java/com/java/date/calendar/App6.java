package com.java.date.calendar;

public class App6 {
	// convert from java.util.Date to java.sql.Date.
	public static void main(String[] args) {
		System.out.println(getCurrentDate());
	}

	private static java.sql.Date getCurrentDate() {
		java.util.Date today = new java.util.Date();
		return new java.sql.Date(today.getTime());
	}
}
