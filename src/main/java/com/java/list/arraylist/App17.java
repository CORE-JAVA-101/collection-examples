package com.java.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class App17 {
	public static void main(String[] args) {
		List<String> m = new ArrayList<String>();
		m.add("MANISH");
		m.add("MONICA");

		List<String> s = new ArrayList<String>();
		s.add("SONALI");
		s.add("SUNITA");

		System.out.println(s);// 1

		s.addAll(1, m);// staring from 1 index of s, will append m and "SUNITA"
						// will be swapped to the end

		System.out.println(s);// 2

		s.addAll(m);

		System.out.println(s);// 3

		System.out.println(s.indexOf("MONICA"));// MONICA occurs first time at 2
												// index
		System.out.println(s.lastIndexOf("MONICA"));// MONICA occurs last time
													// at 5 th index

	}
}
