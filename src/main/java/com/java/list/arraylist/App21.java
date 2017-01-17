package com.java.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App21 {
	// SORTING
	// Using Collections.sort
	
	// Collections(C) is a class[java.util]
	// Collection(I) is an interface[java.util]

	/*
	 * 
	 * remember:
	 * 
	 * public class Collections { //code}
	 * 
	 * remember:
	 * 
	 * 
	 * public interface Collection<E> extends Iterable<E> { //code
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("ROHIT");
		list.add("DHAWAN");
		list.add("VIRAT");
		list.add("RAHANE");
		list.add("MANISH");
		list.add("MSD");

		System.out.println(list);

		Collections.sort(list);

		System.out.println(list);

	}
}
