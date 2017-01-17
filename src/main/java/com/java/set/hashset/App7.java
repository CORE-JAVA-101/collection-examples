package com.java.set.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App7 {
	// removing duplicate from list
	public static void main(String[] args) {
		List<String> nameList = new ArrayList<String>();

		nameList.add("abc");
		nameList.add("abc");
		nameList.add("def");

		System.out.println("List content: " + nameList);

		Set<String> nameSet = new HashSet<String>(nameList);
		System.out.println("Set content: " + nameSet);

		nameList.clear();
		nameList.addAll(nameSet);

		System.out.println("List content: " + nameList);

	}
}