package com.java.list.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class App26 {
	// using set(int index,Object object) with user defined datatype.

	// it replaces an object at a given index
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();

		for (int i = 1; i <= 3; i++) {
			Employee emp = new Employee(UUID.randomUUID().toString(), "NAME-"
					+ i, "CITY-" + i);
			empList.add(emp);
		}

		System.out.println(empList);

		Employee emp = new Employee("1234", "RAHUL", "BLR");

		empList.set(0, emp);
		System.out.println(empList);
	}
}
