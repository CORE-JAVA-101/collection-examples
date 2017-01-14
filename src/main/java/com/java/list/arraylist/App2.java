package com.java.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class App2 {
	// 1. creating String/Integer type ArayList.
	// 2. adding elements
	// 3. getting elements based upon index.
	public static void main(String[] args) {

		System.out.println("******student name list****");
		// 1. creating arraylist

		List<String> studentNameList = new ArrayList<String>();
		// before adding elements
		System.out.println("isEmpty: " + studentNameList.isEmpty());
		System.out.println("size: " + studentNameList.size());

		// 2. adding elements: add method returns true
		studentNameList.add("VIRAT");
		studentNameList.add("SACHIN");
		studentNameList.add("RAHUL");
		studentNameList.add("RAHUL"); // arraylist can contain duplicate
										// elments.

		// 3. getting elements based upon index.

		System.out.println(studentNameList.get(0));
		System.out.println(studentNameList.get(1));
		System.out.println(studentNameList.get(2));
		System.out.println(studentNameList.get(3));

		// after adding elements;
		System.out.println("isEmpty: " + studentNameList.isEmpty());
		System.out.println("size: " + studentNameList.size());

	}
}
