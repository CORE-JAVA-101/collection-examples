package com.java.set.hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class App8 {
	// using linked hash set , it is another implementation of set. 
	//it maintains the insertion order.
	
	public static void main(String[] args) {
		Set<String> nameSet = new HashSet<String>();

		nameSet.add("rohit");
		nameSet.add("kohli");
		nameSet.add("msd");
		nameSet.add("raina");

		System.out.println(nameSet);

		nameSet = new LinkedHashSet<String>();

		nameSet.add("rohit");
		nameSet.add("kohli");
		nameSet.add("msd");
		nameSet.add("raina");

		System.out.println(nameSet);
	}
}
// output
/*
[kohli, rohit, msd, raina]
[rohit, kohli, msd, raina]

*/