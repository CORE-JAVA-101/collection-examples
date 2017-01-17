package com.java.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class App19 {
	// arraylist to array
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("ROHIT");
		list.add("DHAWAN");
		list.add("VIRAT");
		list.add("RAHANE");
		list.add("MANISH");
		list.add("MSD");

		Object[] arr = list.toArray();// returns Object[]

		System.out.println(arr);
		// see now the content is not showing as readable content.
		// because object class toString() not wriiten for showing content.
		// it is showing type name and hexadecimal form of hashCode.

		for (Object obj : arr) {
			String s = (String) obj;// downcasting or narrowing
			System.out.print(s + "\t");
		}

	}
}
