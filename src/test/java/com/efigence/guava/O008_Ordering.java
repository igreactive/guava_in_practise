package com.efigence.guava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import com.google.common.collect.Ordering;

public class O008_Ordering {

	Ordering<String> byLength = new Ordering<String>() {

		@Override
		public int compare(String s1, String s2) {
			return Integer.compare(s1.length(), s2.length());
		}
	};

	@Test
	public void shouldApplyCustomOrdering() {
		// given
		List<Integer> ints = Arrays.asList(1, 2, 10, 20);
		// then
		Collections.sort(ints, Ordering.explicit(1, 10, 2, 20));
		System.out.println(ints);
	}

	@Test
	public void compoundOrderingExample() {
		// given
		List<String> strings = Arrays.asList("001", "Z", null, "22", "A", "33", "11");
		// then
		Collections.sort(strings,
			byLength.reverse().nullsFirst().compound(Ordering.natural().reverse()));
		System.out.println(strings);
	}
}
