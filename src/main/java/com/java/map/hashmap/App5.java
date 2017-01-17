package com.java.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class App5 {
	// iteration over map
	public static void main(String[] args) {
		Map<String, Integer> temperatueMap = new HashMap<String, Integer>();

		temperatueMap.put("Mumbai", 28);
		temperatueMap.put("New Delhi", 30);
		temperatueMap.put("Bangalore", 33);

		System.out.println(temperatueMap);

		Set<String> keySet = temperatueMap.keySet();

		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {


			String key = it.next();
			Integer val = temperatueMap.get(key);// retrieve the value using key
			System.out.println(key + "--" + val);
		}

	}
}