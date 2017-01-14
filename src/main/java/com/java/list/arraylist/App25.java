package com.java.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;

public class App25 {
	// iterating user defined datatype usingi iterator and listiterator
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();

		for (int i = 1; i <= 3; i++) {
			Employee emp = new Employee(UUID.randomUUID().toString(), "NAME-"
					+ i, "CITY-" + i);
			empList.add(emp);
		}

		System.out.println("iterator-next");
		Iterator<Employee> empIterator = empList.iterator(); // one-direction
		while (empIterator.hasNext()) {
			Employee emp = empIterator.next();
			System.out.println(emp);
		}
		System.out.println("\n");
		ListIterator<Employee> empListIterator = empList.listIterator();// both

		System.out.println("list-iterator next");
		while (empListIterator.hasNext()) { // next
			Employee emp = empListIterator.next();

			System.out.println(emp);
		}

		System.out.println("\n");
		System.out.println("list-iterator prev");
		while (empListIterator.hasPrevious()) { // previous
			Employee emp = empListIterator.previous();

			System.out.println(emp);
		}

	}
}
