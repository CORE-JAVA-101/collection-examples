package com.java.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class App16 {
	// contains: see example
	// containsAll: see example
	public static void main(String[] args) {
		List<String> m = new ArrayList<String>();
		m.add("MANISH");
		m.add("MONICA");

		List<String> s = new ArrayList<String>();
		s.add("SONALI");
		s.add("SUNITA");

		System.out.println(s);

		s.addAll(1, m);// staring from 1 index of s, will append m and "SUNITA"
						// will be swapped to the end

		System.out.println(s);

		System.out.println(s.contains("MONICA"));// if found return true

		System.out.println(s.containsAll(m));// if found entire collection
												// sequentially return true.
	}
}
