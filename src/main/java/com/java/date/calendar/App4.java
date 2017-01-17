package com.java.date.calendar;

public class App4 {
	public static void main(String[] args) {
		/*
		 * 
		 * Java's java.sql.Timestamp class is used in the JDBC API. If you need
		 * to set a date + time on a java.sql.PreparedStatement or get a date +
		 * time from a java.sql.ResultSet, you will interact with
		 * java.sql.Timestamp.
		 * 
		 * Actually, java.sql.Timestamp extends java.util.Date, so anything you
		 * can do with a java.util.Date you can also do with a
		 * java.sql.Timestamp.
		 */

		/*
		 * 
		 * The biggest difference between java.sql.Date and java.sql.Timestamp
		 * is that the java.sql.Date only keeps the date, not the time, of the
		 * date it represents. So, for instance, if you create a java.sql.Date
		 * using the date and time 2009-12-24 23:20, then the time (23:20) would
		 * be cut off. If you use a java.sql.Timestamp then the time is kept.
		 */

		long time = System.currentTimeMillis();
		java.sql.Timestamp timestamp = new java.sql.Timestamp(time);

		System.out.println("timestamp: " + timestamp);
		System.out.println("Nano second: " + timestamp.getNanos());
	}
}
