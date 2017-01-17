package com.java.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class App1 {
	public static void main(String[] args) {

		Map<String, Integer> temperatueMap = new HashMap<String, Integer>();

		temperatueMap.put("Mumbai", 28);
		temperatueMap.put("New Delhi", 30);
		temperatueMap.put("Bangalore", 33);
		temperatueMap.put("Bangalore", 40);
		
System.out.println(temperatueMap);
		temperatueMap.remove("Bangalore");
		
		                                                                                                                                                                                                                                                                                                                                                                                                                                      
		System.out.println(temperatueMap);// why 3 objects in output, why
											// bangalore temperature is not 33
											//bcoz last record overwrites the old record.

	}
}