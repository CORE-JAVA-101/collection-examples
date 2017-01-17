package com.java.set.hashset;

import java.util.HashSet;
import java.util.Set;
/*
 * Creating and printing a Set<String>
 * Checking the size... Does not allow Duplicate elements 
 * */
public class App01 {
	public static void main(String[] args) {
		Set<String> nameSet = new HashSet<String>();

		nameSet.add("rohit");
		nameSet.add("kohli");
		nameSet.add("msd");
		nameSet.add("msd");

		System.out.println(nameSet.size());// 3 , why not 4
		
		System.out.println(nameSet);

	}
}