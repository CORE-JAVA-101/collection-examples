package com.java.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class App3 {
	// Create an Integer Type ArrayList
	// Note we cannot create ArrayList for primitive type.
	// because collection concept only for objects.
	public static void main(String[] args) {

		List<Integer> studentAgeList = new ArrayList<Integer>();// can contain
																// only Integers

		studentAgeList.add(10);
		studentAgeList.add(20);
		studentAgeList.add(30);

		System.out.println(studentAgeList.get(0));
		System.out.println(studentAgeList.get(1));
		System.out.println(studentAgeList.get(2));

		// arraylist maintains the insertion order.
	}
}
