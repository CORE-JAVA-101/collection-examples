package com.java.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App5 {
	// display using iterator
	// with iterator only we can iterate forward
	public static void main(String[] args) {
		List<String> studentNameList = new ArrayList<String>();

		studentNameList.add("VIRAT");
		studentNameList.add("RAHUL");
		studentNameList.add("ROHIT");

		Iterator<String> it = studentNameList.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
