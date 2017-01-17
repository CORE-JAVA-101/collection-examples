package com.java.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class App28 {
	// contains:
	public static void main(String[] args) {
		List<Employee1> empList = new ArrayList<Employee1>();

		for (int i = 1; i <= 4; i++) {
			Employee1 emp = new Employee1("ID-" + i, "NAME-" + i, "CITY-" + i);
			empList.add(emp);
		}

		System.out.println(empList);

		// we want to check below object contains in the list or not.
		Employee1 emp = new Employee1("3", "NAME-3", "CITY-3");

		System.out.println(empList.contains(emp));// it checks only equality as
													// we have overridden equals
													// method.
	}
}
