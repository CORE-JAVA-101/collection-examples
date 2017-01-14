package com.java.list.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class App24 {
	// iterationg over empLIst to extract individual attribute of each object
	// using for loop
	// using foreach loop
	// to extract u must have getters in Employee class for the attributes
	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<Employee>();

		for (int i = 1; i <= 3; i++) {
			Employee emp = new Employee(UUID.randomUUID().toString(), "NAME-"
					+ i, "CITY-" + i);
			empList.add(emp);
		}

		System.out.println("Display with for loop");
		for (int i = 0; i < empList.size(); i++) {
			Employee emp = empList.get(i);

			System.out.println(emp.getEmpId() + " || " + emp.getEmpNm()
					+ " || " + emp.getEmpCity());
		}

		System.out.println("\n");

		System.out.println("Display with for each loop");

		for (Employee emp : empList) {
			System.out.println(emp.getEmpId() + " || " + emp.getEmpNm()
					+ " || " + emp.getEmpCity());
		}
	}
}
