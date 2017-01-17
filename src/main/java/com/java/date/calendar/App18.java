package com.java.date.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class App18 {
	public static void main(String[] args) {
		Calendar calendar = new GregorianCalendar();
		TimeZone timeZone = calendar.getTimeZone();

		calendar.setTimeZone(timeZone);

		/*
		 * The getOffset() method returns the offset in milliseconds for the
		 * given time zone to UTC, at the given time. For instance, the
		 * "Europe/Copenhagen" time zone may have one hour offset during the
		 * winter, and two hours during the summer time due to daylight savings.
		 */
		System.out.println(timeZone.getDisplayName());

		System.out.println(timeZone.getID());

		System.out.println(timeZone.getOffset(System.currentTimeMillis()));

		/*
		 * Creating a TimeZone Instance There are two ways to obtain a TimeZone
		 * instance:
		 */
		TimeZone timeZone1 = TimeZone.getDefault();

		TimeZone timeZone2 = TimeZone.getTimeZone("Europe/Copenhagen");

		/*
		 * The first method (TimeZone.getDefault()) returns the default time
		 * zone for the system (computer) this program is running on.
		 * 
		 * The second method (TimeZone.getTimeZone("Europe/Copenhagen")) returns
		 * the TimeZone corresponding to the given time zone ID (in this example
		 * "Europe/Copenhagen"). There is a list of available time zone ID's at
		 * the end of this text.
		 */

		/*
		 * Converting Between Time Zones You can covert the date and time in a
		 * Calendar between different time zones. Here is an example of how to
		 * do this:
		 */
		TimeZone timeZone3 = TimeZone.getTimeZone("America/Los_Angeles");
		TimeZone timeZone4 = TimeZone.getTimeZone("Europe/Copenhagen");

		calendar = new GregorianCalendar();

		calendar.setTimeZone(timeZone3);
		long timeCPH = calendar.getTimeInMillis();
		System.out.println("timeCPH  = " + timeCPH);
		System.out.println("hour     = " + calendar.get(Calendar.HOUR_OF_DAY));

		calendar.setTimeZone(timeZone4);

		long timeLA = calendar.getTimeInMillis();
		System.out.println("timeLA   = " + timeLA);
		System.out.println("hour     = " + calendar.get(Calendar.HOUR_OF_DAY));
	}

}
