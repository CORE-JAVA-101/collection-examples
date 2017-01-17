package com.java.list.arraylist;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class App37 {
	// avoid concurrent modification exception
	public static void main(String[] args) {

		List<String> list = new CopyOnWriteArrayList<String>();
		// CopyOnWriteArrayList is fail-safe
		list.add("abc");
		list.add("cde");

		// withIterator(list);
		withListIterator(list);
		System.out.println(list.size());
	}

	public static void withIterator(List<String> list) {

		Iterator<String> it = list.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
			list.add("efg");
			System.out.println("added");
		}
	}

	public static void withListIterator(List<String> list) {
		Iterator<String> it = list.listIterator();

		while (it.hasNext()) {
			System.out.println(it.next());
			list.add("hij");
			System.out.println("added");
		}
	}

}