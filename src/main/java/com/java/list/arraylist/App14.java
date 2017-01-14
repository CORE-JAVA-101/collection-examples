package com.java.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class App14 {
	// insert a collection into another collection at a specific index.
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

	}
}
