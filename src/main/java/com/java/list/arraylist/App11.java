package com.java.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class App11 {
	// making empty an ArrayList
	// using clear()
	public static void main(String[] args) {
		List<String> studentNameList = new ArrayList<String>();

		System.out.println("1-" + studentNameList + " "
				+ studentNameList.isEmpty());
		studentNameList.add("VIRAT");
		studentNameList.add("RAHUL");
		studentNameList.add("ROHIT");
		System.out.println("2-" + studentNameList + " "
				+ studentNameList.isEmpty());

		studentNameList.clear();// using clear
		System.out.println("3-" + studentNameList + " "
				+ studentNameList.isEmpty());

		System.out.println("Again add the elements");

		studentNameList.add("VIRAT");
		studentNameList.add("RAHUL");
		studentNameList.add("ROHIT");
		studentNameList.add("SACHIN");

		System.out.println("4-" + studentNameList + " "
				+ studentNameList.isEmpty());

	}
}
