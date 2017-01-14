package com.java.list.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class App22 {
	// adding user defined data type to list
	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<Employee>();

		for (int i = 1; i <= 3; i++) {
			Employee emp = new Employee(UUID.randomUUID().toString(), "NAME-"
					+ i, "CITY-" + i);
			empList.add(emp);
		}

		System.out.println("3 employees added");

		System.out.println("displaying emplist");

		System.out.println(empList);

		// you will see 3 employee objects with hexadecimal hashcodes.

		// to see the content you have to override toString() in employee class.

		// to override toString() use alt+shift+s,s. after overriding run this
		// program again.
	}
}
