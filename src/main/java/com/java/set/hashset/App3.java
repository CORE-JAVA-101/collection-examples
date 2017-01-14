package com.java.set.hashset;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * 
 * resolving java.util.ConcurrentModificationException: fail-safe
 */
public class App3 {
	public static void main(String[] args) {
		
		
		Set<String> nameSet = null;
		nameSet = new CopyOnWriteArraySet<String>();

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
