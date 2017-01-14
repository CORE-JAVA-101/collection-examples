package com.java.list.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class App6 {
	// display with list iterator
	// can move bi-directional
	public static void main(String[] args) {
		List<String> studentNameList = new ArrayList<String>();

		studentNameList.add("VIRAT");
		studentNameList.add("RAHUL");
		studentNameList.add("ROHIT");

		ListIterator<String> lit = studentNameList.listIterator();

		System.out.println("forward iteration");
		while (lit.hasNext()) {
			System.out.println(lit.next());
		}

		System.out.println("\nreverse iteration");
		while (lit.hasPrevious())
			System.out.println(lit.previous());

	}
}
