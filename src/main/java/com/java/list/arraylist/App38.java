package com.java.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();

		list.add("ROHIT");
		list.add("DHAWAN");
		list.add("VIRAT");

		System.out.println(list);

		list.add("RAHANE");
		list.add("MANISH");
		System.out.println(list);

		list = Collections.unmodifiableList(list);

		list.add("MSD"); // u will get java.lang.UnsupportedOperationException here
		
	}

}