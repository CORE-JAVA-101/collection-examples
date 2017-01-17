package com.java.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class App10 {
	// Removing elements form the ArrayList
	// using remove(int index)
	// using remove(Object object)
	public static void main(String[] args) {

		List<String> studentNameList = new ArrayList<String>();

		System.out.println("1-" + studentNameList);
		studentNameList.add("VIRAT");
		studentNameList.add("RAHUL");
		studentNameList.add("ROHIT");
		System.out.println("2-" + studentNameList);

		System.out.println("Remove: " + studentNameList.remove(0));// removing
																	// index
																	// wise.
		// remove returns the object that it has removed. see above line.

		System.out.println("3-" + studentNameList);

		System.out.println("Remove: " + studentNameList.remove("RAHUL"));// remove by object content

		System.out.println("4-" + studentNameList);

	}
}
