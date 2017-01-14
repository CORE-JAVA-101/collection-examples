package com.java.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class App27 {
	// contains:
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();

		for (int i = 1; i <= 3; i++) {
			Employee emp = new Employee("" + i, "NAME-" + i, "CITY-" + i);
			empList.add(emp);
		}

		System.out.println(empList);

		// we want to check below object contains in the list or not.
		Employee emp = new Employee("1", "NAME-1", "CITY-1");

		System.out.println(empList.contains(emp));

		// it will give false. because here the object have same content like
		// the object at index 1 in the list.

		// but index-1 object and the emp object has different reference and
		// hence object class equals method return false.

		// so we need to override equals method in employee class for content
		// comparison.

		// see the next example

	}
}
