package com.java.date.calendar;

public class App3 {

	// java.sql.Date
	public static void main(String[] args) {
		/*
		 * 
		 * Java's java.sql.Date class is used in the JDBC API. If you need to
		 * set a date on a java.sql.PreparedStatement or get a date from a
		 * java.sql.ResultSet, you will interact with java.sql.Date.
		 * 
		 * Actually, java.sql.Date extends java.util.Date, so anything you can
		 * do with a java.util.Date you can also do with a java.sql.Date.
		 */
		long time = System.currentTimeMillis();
		java.sql.Date date = new java.sql.Date(time);
		System.out.println(date);
	}
}
