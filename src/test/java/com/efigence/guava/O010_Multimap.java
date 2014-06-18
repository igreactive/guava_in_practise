package com.efigence.guava;

import org.junit.Test;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

public class O010_Multimap {

	@Test
	public void multimapDemo() {
		// given
		Multimap<String, Integer> multimap = HashMultimap.create();
		multimap.put("a", 1);
		multimap.put("a", 2);
		multimap.put("b", 1);
		// when
		System.out.println(multimap.asMap().entrySet());
		System.out.println(multimap.entries());
		System.out.println(multimap.keySet());
		System.out.println("Multimap -> Multiset: " + multimap.keys());
		System.out.println(multimap.values());
		System.out.println(multimap.size());
		System.out.println(multimap.get("a").size());
		System.out.println(multimap.containsKey("c"));
		// Zagadka
		// System.out.println(multimap.get("c").size());
	}
}
