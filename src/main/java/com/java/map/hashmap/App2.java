
package com.java.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class App2 {
	// verifying a key exists or not in a map
	public static void main(String[] args) {
		Map<String, Integer> temperatueMap = new HashMap<String, Integer>();

		temperatueMap.put("Mumbai", 28);
		temperatueMap.put("New Delhi", 30);
		temperatueMap.put("Bangalore", 33);

		System.out.println(temperatueMap);

		boolean isContains = temperatueMap.containsKey("Mumbai");
		//System.out.println("Mumbai: " + isContains);

		isContains = temperatueMap.containsKey("Chennai");
		System.out.println("Chennai: " + isContains);

		Integer temp = temperatueMap.get("Chennai");
		System.out.println(temp);// retuns null when it doesnt find the key
	}
}