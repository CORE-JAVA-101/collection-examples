package com.java.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class App7 {
	public static void main(String[] args) {
		Map<String, Integer> temperatueMap = new HashMap<String, Integer>();

		temperatueMap.put("Mumbai", 28);
		temperatueMap.put("New Delhi", 30);
		temperatueMap.put("Bangalore", 33);

		System.out.println(temperatueMap);
		// every element is an entry in a map. so while iterating over map we
		// have to go through each entry by using for loop

		Set<Entry<String, Integer>> entrySet = temperatueMap.entrySet();

		Iterator<Entry<String, Integer>> entrySetIterator = entrySet.iterator();

		while (entrySetIterator.hasNext()) {
			Entry entry = entrySetIterator.next();
			System.out.println("key: " + entry.getKey() + ", value: "
					+ entry.getValue());
		}

	}
}