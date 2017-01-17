package com.java.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class App9 {
	// set is used to replace/update an object at a given index.
	public static void main(String[] args) {
		List<String> studentNameList = new ArrayList<String>();
		System.out.println("display 1: " + studentNameList);
		studentNameList.add("JAVA");
		System.out.println(studentNameList);
		studentNameList.set(0, "KUMAR");
		System.out.println(studentNameList);

		// so far we got know how to insert,retrieve,update an ArrayList.

		// next is removing elements from ArrayList

	}
}
