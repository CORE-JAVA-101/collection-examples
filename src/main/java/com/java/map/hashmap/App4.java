package com.java.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class App4 {
	// iteration over map
	public static void main(String[] args) {
		Map<String, Integer> temperatueMap = new HashMap<String, Integer>();

		temperatueMap.put("Mumbai", 28);
		temperatueMap.put("New Delhi", 30);
		temperatueMap.put("Bangalore", 33);

		System.out.println(temperatueMap);
		// every element is an entry in a map. so while iterating over map we
		// have to go through each entry by using for loop

		Set<Entry<String, Integer>> entrySet = temperatueMap.entrySet();

		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + "--" + entry.getValue());
		}

	}
}