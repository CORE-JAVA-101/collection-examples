package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @author admin synchronized collection [list,set,map]
 */
public class App1 {
	public static void main(String[] args) {
		/**
		 * <code>synchronizedList</code>
		 */
		List<String> list = new ArrayList<String>();
		list = Collections.synchronizedList(list);
		list.add("ASIS");
		list.add("RAHUL");
		list.add("SUVAM");

		synchronized (list) {
			Iterator i = list.iterator(); // Must be in synchronized block
			while (i.hasNext())
				System.out.println(i.next());
		}

		/**
		 * synchronizedSet
		 */
		Set<String> set = new HashSet<String>();
		set = Collections.synchronizedSet(set);
		set.add("ROHAN");
		set.add("MAYANKJ");
		set.add("DRISHTI");

		synchronized (set) {
			Iterator i = set.iterator(); // Must be in the synchronized block
			while (i.hasNext())
				System.out.println(i.next());
		}

		/**
		 * synchronizedMap
		 */
		Map<String, String> map = new HashMap<String, String>();
		map = Collections.synchronizedMap(map);
		map.put("K1", "V1");
		map.put("K2", "V2");
		map.put("K3", "V3");

		Set s = map.keySet(); // Needn't be in synchronized block

		synchronized (map) { // Synchronizing on m, not s!
			Iterator i = s.iterator(); // Must be in synchronized block
			while (i.hasNext())
				System.out.println(i.next());
		}

	}
}
