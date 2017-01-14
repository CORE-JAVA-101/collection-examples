package com.java.set.hashset;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * public interface Set<E> extends Collection<E> {}
 * 
 * in this example we will see all the methods of collection interface using hashset
 */
public class App1 {
	public static void main(String[] args) {
		Set<String> nameSet = null;
		nameSet = new HashSet<String>();

		boolean flag = nameSet.add("ASIS");
		System.out.println("isDuplicate: " + flag);
		System.out.println("Hashcode: " + nameSet.hashCode());
		nameSet.add("RAHUL");
		flag = nameSet.add("ASIS");
		System.out.println("isDuplicate: " + flag);
		System.out.println("Elements: " + nameSet);
		System.out.println("Size: " + nameSet.size());
		System.out.println("isEmpty: " + nameSet.isEmpty());
		System.out.println("Contains: " + nameSet.contains("ASIS"));

		Set<String> nameSet1 = new HashSet<String>();
		nameSet1.add("ASIS");
		nameSet1.add("ABHISEKH");

		System.out.println("Hashcode: " + nameSet.hashCode());
		flag = nameSet.addAll(nameSet1);
		System.out.println("Hashcode: " + nameSet.hashCode());
		System.out.println("isDuplicate: " + flag);
		System.out.println("Elements: " + nameSet);

		System.out.println("ContainsAll: " + nameSet.containsAll(nameSet1));

		System.out.println("****Iteration using for-each****");
		for (String s : nameSet) {
			System.out.println(s);
		}

		System.out.println("***Iterating using for-each and toArray()****");
		Object[] objArr = nameSet.toArray();
		for (Object obj : objArr) {
			System.out.println(obj);
		}

		System.out
				.println("***Iterating using for loop index and toArray()****");
		for (int i = 0; i < objArr.length; i++) {
			System.out.println(objArr[i]);
		}

		System.out.println("**Iterating using iterator***");
		Iterator<String> it = nameSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("Elements: " + nameSet);
		flag = nameSet.containsAll(nameSet1);
		System.out.println("containsAll: " + flag);

		System.out.println("Elements: " + nameSet);
		// nameSet.retainAll(nameSet1);
		System.out.println("Elements: " + nameSet);

		System.out.println("Elements: " + nameSet);
		// nameSet.removeAll(nameSet1);
		System.out.println("Elements: " + nameSet);

		System.out.println("Elements: " + nameSet);
		flag = nameSet.remove("RAHUL");
		System.out.println("isSuccess: " + flag);
		System.out.println("Elements: " + nameSet);

		nameSet.clear();
		System.out.println("Elements: " + nameSet);
		System.out.println("Hashcode: " + nameSet.hashCode());
	}
}
