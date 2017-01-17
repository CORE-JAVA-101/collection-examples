package com.java.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class App4 {
	// looping over arraylist to retrieve elements
	// 1. for loop
	// 2. for each loop or advanced for loop
	public static void main(String[] args) {
		List<String> studentNameList = new ArrayList<String>();

		studentNameList.add("VIRAT");
		studentNameList.add("RAHUL");
		studentNameList.add("ROHIT");

		System.out.println("display with for loop");
		for (int i = 0; i < studentNameList.size(); i++) {
			System.out.println(studentNameList.get(i));
		}

		System.out.println("\ndisplay with for each loop");
		for (String studentName : studentNameList) {
			System.out.println(studentName);
		}
	}
}
