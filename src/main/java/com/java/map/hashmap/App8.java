package com.java.map.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class App8 {
	public static void main(String[] args) {
		Map<String, Integer> temperatueMap = new HashMap<String, Integer>();

		temperatueMap.put("Mumbai", 28);
		temperatueMap.put("New Delhi", 30);
		temperatueMap.put("Bangalore", 33);

		System.out.println(temperatueMap);

		temperatueMap = new LinkedHashMap<String, Integer>(); // maintains
																// insertion
																// order
		temperatueMap.put("Mumbai", 28);
		temperatueMap.put("New Delhi", 30);
		temperatueMap.put("Bangalore", 33);

		System.out.println(temperatueMap);

	}
}
