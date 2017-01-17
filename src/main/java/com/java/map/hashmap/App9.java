package com.java.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class App9 {
	// sorting by keys by using TreeMap which is another implementation of map
	public static void main(String[] args) {
		Map<String, Integer> temperatueMap = new HashMap<String, Integer>();

		temperatueMap.put("Mumbai", 28);
		temperatueMap.put("New Delhi", 30);
		temperatueMap.put("Bangalore", 33);

		System.out.println(temperatueMap);

		temperatueMap = new TreeMap<String, Integer>(); // sorts the map by keys
		
		temperatueMap.put("Mumbai", 28);
		temperatueMap.put("New Delhi", 30);
		temperatueMap.put("Bangalore", 33);
		
		System.out.println(temperatueMap);

	}

}