package com.java.set.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App6 {
	// hashset to list
	public static void main(String[] args) {
		Set<String> nameSet = new HashSet<String>();

		nameSet.add("rohit");
		nameSet.add("kohli");
		nameSet.add("msd");
		nameSet.add("msd");

		System.out.println(nameSet);
		List<String> list = new ArrayList<String>(nameSet);

		/* passing the colection as well adding some elements externally */

		list.add("binda");
		list.add("kinda");

		System.out.println(list);

	}
}