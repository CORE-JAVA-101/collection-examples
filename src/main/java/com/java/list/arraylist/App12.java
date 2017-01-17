package com.java.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class App12 {
	// add an element at a specific index.
	public static void main(String[] args) {

		

		List<String> s = new ArrayList<String>();
		s.add("SONALI");// 0 index
		s.add("SUNITA");// 1 index

		s.add(1, "SUHANI");// SUNITA WIL BE MOVED TO 2 index
		
		System.out.println(s);
	}
}
