package com.java.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class App3 {
	// verifying a values exists or not in the map
	public static void main(String[] args) {
		Map<String, Integer> temperatueMap = new HashMap<String, Integer>();

		temperatueMap.put("Mumbai", 28);
		temperatueMap.put("New Delhi", 30);
		temperatueMap.put("Bangalore", 33);

		System.out.println(temperatueMap);

		boolean isContains = temperatueMap.containsValue(28);
		System.out.println("28: " + isContains);

		isContains = temperatueMap.containsValue(31);
		System.out.println("31: " + isContains);

		// note we cant retrive an object based upon value from a map. we can
		// only retriev by its key. key is always unique.
	}
}