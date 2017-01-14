package com.java.set.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 
 * java.util.ConcurrentModificationException: fail-fast
 */
public class App2 {
	public static void main(String[] args) {
		Set<String> nameSet = null;
		nameSet = new HashSet<String>();

		nameSet.add("A");
		nameSet.add("B");
		nameSet.add("C");

		System.out.println("Elements: " + nameSet);

		Iterator<String> it = nameSet.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
			nameSet.add("D");
		}

		System.out.println("Elements: " + nameSet);

	}
}
/**
 * Exception in thread "main" java.util.ConcurrentModificationException at
 * java.util.HashMap$HashIterator.nextEntry(HashMap.java:806) at
 * java.util.HashMap$KeyIterator.next(HashMap.java:841) at
 * com.java.set.hashset.App2.main(App2.java:22)
 */
