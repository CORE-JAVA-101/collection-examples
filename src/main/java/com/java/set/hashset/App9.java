package com.java.set.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class App9 {
	// avoiding concurrent modification exception
	public static void main(String[] args) {
		Set<Student1> studentSet = new CopyOnWriteArraySet<Student1>();

		Student1 s1 = new Student1(10, "gayatri");
		Student1 s2 = new Student1(20, "arman");
		Student1 s3 = new Student1(30, "soham");
		studentSet.add(s1);
		studentSet.add(s2);
		System.out.println(studentSet.size());
		System.out.println("\n using iterator");
		// using iterator
		Iterator<Student1> it = studentSet.iterator();
		boolean flag = true;
		while (it.hasNext()) {
			System.out.println(it.next());

			if (flag == true) {
				studentSet.add(s3);
				flag = false;
			}

		}

		System.out.println("size: " + studentSet.size());
		System.out.println(studentSet);

	}
}