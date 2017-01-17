package com.java.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App6 {
	public static void main(String[] args) {
		Map<String, Integer> temperatueMap = new HashMap<String, Integer>();

		temperatueMap.put("Mumbai", 28);
		temperatueMap.put("New Delhi", 30);
		temperatueMap.put("Bangalore", 33);

		System.out.println(temperatueMap);

		Set<String> keySet = temperatueMap.keySet();
		
		for(String key:keySet)
		{
			System.out.println(key+"--"+temperatueMap.get(key));
		}
	}
}