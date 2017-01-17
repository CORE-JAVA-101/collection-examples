package com.java.list.arraylist;

// display using iterator and ListIterator

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SelfApp5 {
	public static void main(String[] args) {

		List<String> name = new ArrayList<String>();
		name.add("Raj");
		name.add("Rmaj");
		name.add("pankag");
		name.add("khudiram");

		Iterator<String> it = name.iterator();

		while (it.hasNext())
			System.out.println(it.next());

	
LisIterator<String> it1=name.listIterator();

while(it1.hasPrevious())
	System.out.println(it1.previous());

	}
}
