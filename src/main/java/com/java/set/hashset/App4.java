package com.java.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class App4 {
	public static void main(String[] args) {
		Set<String> nameSet = null;
		nameSet = new HashSet<String>();

		nameSet.add("Aaa");
		nameSet.add("C");
		nameSet.add("Baa");
		
		
		System.out.println("Elements: " + nameSet);

	}
}
