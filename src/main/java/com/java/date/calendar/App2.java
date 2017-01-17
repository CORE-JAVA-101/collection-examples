package com.java.date.calendar;

public class App2 {
	// date comparison
	public static void main(String[] args) {
		java.util.Date date1 = new java.util.Date();
		java.util.Date date2 = new java.util.Date();

		System.out.println("date1:"+date1);
		System.out.println("date2:"+date2);

		
		
		int comparison = date1.compareTo(date2);

		/*
		 * The comparison follows the rules for the Comparable interface,
		 * meaning the compareTo() method returns:
		 * 
		 * An int larger than 0 if the date the method is called on is later
		 * than the date given as parameter. An int value of 0 if the dates are
		 * equal. An int value less than 0 if the date the method is called on
		 * is earlier than the date given as parameter.
		 */
		System.out.println(comparison);

		/*
		 * java.util.Date also has two shortcut methods to do comparisons. These
		 * are before() and after() methods. Here are two examples of how to use
		 * them:
		 */
		boolean isBefore = date1.before(date2);
		boolean isAfter = date1.after(date2);

		System.out.println("before: " + isBefore);
		System.out.println("after: " + isAfter);
	}
}
