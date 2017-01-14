package com.java.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class App8 {
	// we cannot set values to a new index.

	// set method replaces the object at a particular index. see App9
	public static void main(String[] args) {
		List<String> studentNameList = new ArrayList<String>();

		System.out.println("display 1: " + studentNameList);

		studentNameList.set(0, "KUMAR");

		System.out.println(studentNameList);

	}
}
