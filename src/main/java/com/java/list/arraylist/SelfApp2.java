package com.java.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// 1. creating String/Integer type ArayList.
// 2. adding elements
// 3. getting elements based upon index

public class SelfApp2 {
	public static void main(String[] args) {

		List<String> nameList = new ArrayList<String>();

		System.out.println("Namelist Empty? " + nameList.isEmpty());

		nameList.add("Rihana");
		nameList.add("Rohit");
		nameList.add("sasank");
		nameList.add("mohana");
		nameList.add("gourav");
		System.out.println("Retriveal of data based on index***\n");

		System.out.println(nameList.get(2));
		System.out.println(nameList.get(0));
		System.out.println(nameList.get(4));

		System.out.println("Namelist Empty? " + nameList.isEmpty());
		System.out.println("Displaying Names  ************\n");
		Iterator<String> it1 = nameList.iterator();
		while (it1.hasNext())
			System.out.println(it1.next());

		List numList = new ArrayList(nameList);

		for (int i = 1; i <= 5; i++)
			numList.add(i);
		System.out.println("Displaying all elements:********** \n");
		for (Object num : numList)
			System.out.println(num);

	}

}
