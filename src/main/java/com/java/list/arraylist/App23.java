package com.java.list.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class App23 {
	// iterationg over empLIst
	// using for loop
	// using foreach loop
	// to see the content u must have to override toString() in employee class
	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<Employee>();

		for (int i = 1; i <= 3; i++) {
			Employee emp = new Employee(UUID.randomUUID().toString(), "NAME-"
					+ i, "CITY-" + i);
			empList.add(emp);
		}

		System.out.println("Display with for loop");
		for (int i = 0; i < empList.size(); i++) {
			System.out.println(empList.get(i));
		}

		System.out.println("\n");

		System.out.println("Display with for each loop");

		for (Employee emp : empList) {
			System.out.println(emp);
		}
	}
}
