package com.java.set.hashset;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App4 {
	// iterating over a hashset

	public static void main(String[] args) {
		Set<Student1> studentSet = new HashSet<Student1>();

		Student1 s1 = new Student1(10, "gayatri");
		Student1 s2 = new Student1(20, "arman");
		Student1 s3 = new Student1(30, "soham");
		studentSet.add(s1);
		studentSet.add(s2);
		studentSet.add(s3);
		
		System.out.println("\n using for-each");
		
		// for-each
		for (Student1 std : studentSet) {
			System.out.println(std);
		}

		System.out.println("\n using iterator");
		// using iterator
		Iterator<Student1> it = studentSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}

		System.out.println("\n using object array");
		// using object array
		Object[] objArr = studentSet.toArray();
		for (Object obj : objArr) {
			// Student1 std = (Student1) obj;
			System.out.println(obj);
		}

		System.out.println("\n using enumeration");
		// using enumeration

		Enumeration<Student1> enums = Collections.enumeration(studentSet);
		while (enums.hasMoreElements())
			System.out.println(enums.nextElement());
	}
}