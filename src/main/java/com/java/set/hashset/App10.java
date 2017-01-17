package com.java.set.hashset;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/*MAking a set unmodifiable*/

public class App10 {
	public static void main(String[] args) {
		Set<String> nameSet = new HashSet<String>();

		nameSet.add("rohit");
		nameSet.add("kohli");
		System.out.println(nameSet);
		nameSet.add("msd");
		nameSet.add("raina");
		System.out.println(nameSet);

		nameSet = Collections.unmodifiableSet(nameSet);
		/*
		 * Returns an unmodifiable view of the specified set. This method allows
		 * modules to provide users with "read-only" access to internal sets.
		 * Query operations on the returned set "read through" to the specified
		 * set, and attempts to modify the returned set, whether direct or via
		 * its iterator, result in an UnsupportedOperationException.
		 */

		nameSet.add("gautam");// java.lang.UnsupportedOperationException
	}
}