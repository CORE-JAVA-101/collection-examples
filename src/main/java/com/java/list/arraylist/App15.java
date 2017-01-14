package com.java.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class App15 {
	// removeAll: see example
	// retainAll: see example
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

		System.out.println(s);// 1

		s.addAll(r);// appends at last

		System.out.println(s);// 2

		s.addAll(1, m);// inserts at 1 index

		System.out.println(s);// 3

		s.addAll(m);// appends at last

		System.out.println(s); // 4

		s.removeAll(m);// remove all m list elements i.e. 1,2,6,7 index removed

		System.out.println(s); // 5

		s.retainAll(r);// only r list elements will be retained and all other
						// will be removed.

		System.out.println(s); // 6

	}
}
