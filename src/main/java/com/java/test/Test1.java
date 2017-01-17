	package com.java.test;
	
	import java.util.ArrayList;
	import java.util.HashSet;
	import java.util.Iterator;
	import java.util.List;
	import java.util.Set;
	
	public class Test1 {
		public static void main(String[] args) {
			
		Set<String> nameSet=new HashSet<String>();  // Creation of set of name 
		nameSet.add("RAJ");
		nameSet.add("SURAJ");
		nameSet.add("MIHIR");
		nameSet.add("OM");
		nameSet.add("OM");
	 System.out.println(nameSet);
	 
	 List <String> nameList=new ArrayList<String>(nameSet); //Convertion to list from set;
	 		
	 	Iterator<String> it=nameList.iterator();
	 	while(it.hasNext())
	 		System.out.println(it.next());
	}
	}
