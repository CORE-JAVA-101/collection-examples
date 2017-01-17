package com.java.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App36 {
	// concurrent modification exception
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		// ArrayList is fail-fast
		list.add("abc");
		list.add("cde");

		withIterator(list);
		// withListIterator(list);
	}

	public static void withIterator(List<String> list) {

		Iterator<String> it = list.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
			list.add("efg");
		}
	}

	public static void withListIterator(List<String> list) {
		Iterator<String> it = list.listIterator();

		while (it.hasNext()) {
			System.out.println(it.next());
			list.add("hij");
		}
	}

	// see next example how to avoid concurrent modification execption
}

/*
 * 
 * 
 * Exception in thread "main" java.util.ConcurrentModificationException at
 * java.util.ArrayList$Itr.checkForComodification(ArrayList.java:781) at
 * java.util.ArrayList$Itr.next(ArrayList.java:753) at
 * com.java.list.arraylist.App36.withListIterator(App36.java:33) at
 * com.java.list.arraylist.App36.main(App36.java:16)
 */