package com.java.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App20 {
	// SORTING
	// Using Arrays class[java.util]
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("ROHIT");
		list.add("DHAWAN");
		list.add("VIRAT");
		list.add("RAHANE");
		list.add("MANISH");
		list.add("MSD");

		System.out.println(list);

		// sorting
		Object[] arr = list.toArray();
		Arrays.sort(arr);
		for (Object obj : arr) {
			String s = (String) obj;// downcasting or narrowing
			System.out.print(s + "\t");// sorted display
		}

	}
}
