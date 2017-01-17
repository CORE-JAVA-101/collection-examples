package com.java.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class App13 {
	// merging collections
	// using addAll
	public static void main(String[] args) {
		List<String> m = new ArrayList<String>();
		m.add("MANISH");
		m.add("MONICA");

		List<String> r = new ArrayList<String>();
		r.add("RABI");
		r.add("RAHUL");

		List<String> s = new ArrayList<String>();
		s.add("SONALI");
		s.add("SUNITA");

		System.out.println(s);

		s.addAll(m); // appended m content too s

		System.out.println(s);

		s.addAll(r);// append r content to s

		System.out.println(s);
	}
}
