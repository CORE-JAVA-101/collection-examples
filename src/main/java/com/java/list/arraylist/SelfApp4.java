package com.java.list.arraylist;

import java.util.ArrayList;
import java.util.List;

// looping over arraylist to retrieve elements
// 1. for loop
// 2. for each loop or advanced for loop

public class SelfApp4 {
public static void main(String[] args) {
	
	List<Integer> intList=new ArrayList<Integer>();
	
	intList.add(10);
	intList.add(15);
	intList.add(19);
	intList.add(10);
	intList.add(70);

	for(int i=0;i<intList.size();i++)
	System.out.println(intList.get(i));
	
	
	System.out.println();
	
	for(Integer num:intList)
		System.out.println(num);
}

}
