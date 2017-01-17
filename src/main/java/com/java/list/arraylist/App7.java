package com.java.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class App7 {
	// display using collection variable name
	public static void main(String[] args) {
		List<String> studentNameList = new ArrayList<String>();

		studentNameList.add("VIRAT");
		studentNameList.add("RAHUL");
		studentNameList.add("ROHIT");

		System.out.println(studentNameList);
		// we are able to display here because our each element is of string
		// type and string class has overridden toString().
	}
}
