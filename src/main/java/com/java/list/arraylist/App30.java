package com.java.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App30 {
	// sorting: custom sorting using comparator interface

	// all wrapper classes and string class are comparable and they have own
	// sorting logic. so previously we used collections.sort() and the elements
	// are sorted using there own sorting logic
	// Comparable(I) has comparaTo(Type t)
	// Comparator(I) has compare(T t1,T t2)
	// now i want to use the sorting of string elements using custom logic
	/*
	 * remember: public final class String implements java.io.Serializable,
	 * Comparable<String>, CharSequence{//code}
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

		// Collections.sort(list); this is sort by using comparable(I) as string
		// has overridden comparTo()

		Collections.sort(list, new NameComparator());

		System.out.println(list);
	}
}

class NameComparator implements Comparator<String> {

	// Comparator(I) comes under java.util package

	// this is the only method in comparator interface.
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		//
		
		return o1.compareTo(o2);// we called string class comparaTo(). this
								// method is declared under comparable(I)
	}
}