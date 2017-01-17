package com.java.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class App5 {
	// delete all elements
	public static void main(String[] args) {
		Set<String> nameSet = new HashSet<String>();

		nameSet.add("rohit");
		nameSet.add("kohli");
		nameSet.add("msd");
		nameSet.add("msd");
		System.out.println(nameSet);
		System.out.println(nameSet.size());
        nameSet.remove("rohit");
        System.out.println(nameSet);
		System.out.println(nameSet.size());// 3 , why not 4

		nameSet.clear();

		System.out.println(nameSet.size());

		System.out.println(nameSet);

	}
}