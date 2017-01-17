package com.java.date.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class App5 {
	// Parsing and Formatting Date in java

	/*
	 * 
	 * It is possible to both parse dates from strings, and format dates to
	 * strings, using Java's java.text.SimpleDateFormat class. I have covered
	 * SimpleDateFormat in more detail in my Java Internationalization tutorial,
	 * in the text SimpleDateFormat. But I will show you a few examples here:
	 * 
	 * The SimpleDateFormat class works on java.util.Date instances. Here are
	 * two simple examples:
	 * 
	 * SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	 * 
	 * String dateString = format.format( new Date() ); Date date = format.parse
	 * ( "2009-12-31" ); The string passed as parameter to the SimpleDateFormat
	 * class is a pattern that tells how the instance is to parse and format
	 * dates. In the example above I used the pattern "yyyy-MM-dd" which means 4
	 * digits for the year (yyyy), two digits for month (MM) and two digits for
	 * day(dd). The digit groups are separated by dashes (-) because I specified
	 * that in the pattern too, between the digit groups.
	 * 
	 * Below is a list of the most common pattern letters you can use. For a
	 * full list, see the official JavaDoc for the SimpleDateFormat class.
	 * 
	 * y = year (yy or yyyy) M = month (MM) d = day in month (dd) h = hour
	 * (0-12) (hh) H = hour (0-23) (HH) m = minute in hour (mm) s = seconds (ss)
	 * S = milliseconds (SSS) z = time zone text (e.g. Pacific Standard Time...)
	 * Z = time zone, time offset (e.g. -0800) Here are a few pattern examples,
	 * with examples of how each pattern would format or expect to parse a date:
	 * 
	 * yyyy-MM-dd (2009-12-31)
	 * 
	 * dd-MM-YYYY (31-12-2009)
	 * 
	 * yyyy-MM-dd HH:mm:ss (2009-12-31 23:59:59)
	 * 
	 * HH:mm:ss.SSS (23:59.59.999)
	 * 
	 * yyyy-MM-dd HH:mm:ss.SSS (2009-12-31 23:59:59.999)
	 * 
	 * yyyy-MM-dd HH:mm:ss.SSS Z (2009-12-31 23:59:59.999 +0100)
	 */
	public static void main(String[] args) throws ParseException {
		// Convert Date to String.
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String date = sdf.format(new Date());
		System.out.println(date);

		// Convert String to Date.
		sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		String dateInString = "31-08-1982 10:20:56";
		Date date1 = sdf.parse(dateInString);
		System.out.println(date1);

		// Get current date time
		SimpleDateFormat dateFormat = new SimpleDateFormat(
				"yyyy/MM/dd HH:mm:ss");
		Date date2 = new Date();
		System.out.println(dateFormat.format(date2));

		// Convert Calendar to Date
		Calendar calendar = Calendar.getInstance();
		Date date3 = calendar.getTime();
		System.out.println(date3);

		// Convert Date to Calendar.
		sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		dateInString = "22-01-2015 10:20:56";
		Date date5 = sdf.parse(dateInString);

		calendar = Calendar.getInstance();
		calendar.setTime(date5);
		System.out.println(calendar);
		
		// Creating Date
		Date date4 = new Date(System.currentTimeMillis());
		System.out.println(date4);
	}
}
