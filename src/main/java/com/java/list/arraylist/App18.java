package com.java.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class App18 {
	// forming a sublist
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("ROHIT");
		list.add("DHAWAN");
		list.add("VIRAT");
		list.add("RAHANE");
		list.add("MANISH");
		list.add("MSD");

		List<String> subList = list.subList(1, 4);
		// starts from 1 index(included) ends at 4 index(excluded)

		System.out.println(subList);

	}
}
